package firefly.grpc;

import firefly.grpc.modules.FireflyClient;
import firefly.grpc.modules.FireflyServer;

import javax.swing.*;
import java.awt.*;

public class FireflyProcess extends JFrame implements Runnable {
    private static final int WINDOW_SIZE = 250;
    private final Image darkFirefly;
    private final Image brightFirefly;

    // Phasen Variabeln
    private double phase;
    private double omega = 1; // Eigenfrequenz
    private final double K = 0.01; // Kopplungsstärke

    private boolean isBright = false;
    private final Object lock = new Object();

    private final FireflyClient fireflyClient;
    private final int myPort;
    private final int otherPort;

    public FireflyProcess(String myPort, String otherPort) {
        this.myPort = Integer.parseInt(myPort);
        this.otherPort = Integer.parseInt(otherPort);
        this.fireflyClient = new FireflyClient("localhost", this.otherPort);

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
            repaint();
            try {
                Thread.sleep(1000); // Blinkintervall: 500 ms
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

    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: FireflyProcess <myPort> <otherPort>");
            System.exit(1);
        }

        String myPort = args[0];
        String otherPort = args[1];

        FireflyProcess firefly = new FireflyProcess(myPort, otherPort);
        Thread fireflyThread = new Thread(firefly);
        fireflyThread.start();
    }
}
