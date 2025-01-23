package firefly.grpc;

import firefly.grpc.modules.FireflyClient;
import firefly.grpc.modules.FireflyServer;

import javax.swing.*;
import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FireflyProcess extends JFrame implements Runnable {
    private static final int WINDOW_SIZE = 250;
    private final Image darkFirefly;
    private final Image brightFirefly;

    // Phasen Variabeln
    private double phase;
    private double omega = 1; // Eigenfrequenz
    private final double K = 0.8; // Kopplungsstärke

    private boolean isBright = false;
    private final Object lock = new Object();

    private final FireflyClient fireflyClient;
    private final int myPort;

    public FireflyProcess(String myPort, List<Integer> otherPorts) {
        this.myPort = Integer.parseInt(myPort);
        this.fireflyClient = new FireflyClient("localhost", otherPorts);

        // Lade die Bilder
        this.brightFirefly = new ImageIcon("resources/an.jpeg").getImage();
        this.darkFirefly = new ImageIcon("resources/aus.jpeg").getImage();

        // Initialisiere das Fenster
        setTitle("Glühwürmchen");
        setSize(WINDOW_SIZE, WINDOW_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void run() {
        // Starte den Server auf diesem Port
        FireflyServer server = new FireflyServer(myPort);
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

        while (true) {
            synchronized (lock) {
                isBright = !isBright;
            }
            fireflyClient.notifyFirefly((Math.sin(this.phase) + 1) / 2);
            updatePhase(FireflyServer.getReceivedFlash());
            repaint();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Image fireflyImage = isBright ? brightFirefly : darkFirefly;

        int imageSize = WINDOW_SIZE;
        g.drawImage(fireflyImage, (WINDOW_SIZE - imageSize) / 2, (WINDOW_SIZE - imageSize) / 2, imageSize, imageSize, null);
    }

    private void updatePhase(double influence) {
        synchronized (lock) {
            this.phase += omega + K * influence;  // influence kommt vom anderen Glühwurm
            this.phase = this.phase % (2 * Math.PI);  // Um die Phase im Bereich [0, 2π] zu halten
        }
    }

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: FireflyProcess <myPort> <otherPort1> <otherPort2> ...");
            System.exit(1);
        }

        String myPort = args[0];
        // Alle weiteren Argumente sind die Ports der anderen Clients
        List<Integer> otherPorts = Arrays.stream(Arrays.copyOfRange(args, 1, args.length))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        FireflyProcess firefly = new FireflyProcess(myPort, otherPorts);
        Thread fireflyThread = new Thread(firefly);
        fireflyThread.start();
    }
}
