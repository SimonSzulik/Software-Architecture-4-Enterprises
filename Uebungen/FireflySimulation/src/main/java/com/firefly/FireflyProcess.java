package com.firefly;

import javax.swing.*;
import java.awt.*;

public class FireflyProcess extends JFrame implements Runnable {
    private int x, y; // Koordinaten im Torus
    private static final int WINDOW_SIZE = 200; // Fenstergröße
    private static final String BRIGHT_IMAGE = "/resources/an.jpeg";
    private static final String DARK_IMAGE = "/resources/aus.jpeg";

    private boolean isBright = false; // Zustand des Glühens
    private final Object lock = new Object(); // Thread-Sicherheit

    // Bilder für die Darstellung
    private final Image brightFirefly;
    private final Image darkFirefly;

    public FireflyProcess(int x, int y) {
        this.x = x;
        this.y = y;

        // Lade die Bilder
        this.brightFirefly = new ImageIcon(BRIGHT_IMAGE).getImage();
        this.darkFirefly = new ImageIcon(DARK_IMAGE).getImage();

        // Initialisiere das Fenster
        setTitle("Glühwürmchen (" + x + ", " + y + ")");
        setSize(WINDOW_SIZE, WINDOW_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void run() {
        while (true) {
            // Glühen umschalten
            synchronized (lock) {
                isBright = !isBright;
            }

            // Repaint aufrufen, um den Zustand zu aktualisieren
            repaint();

            try {
                Thread.sleep(500); // Blinkintervall: 500 ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Image fireflyImage = isBright ? brightFirefly : darkFirefly;

        // Zeichne das Glühwürmchen in der Mitte des Fensters
        int imageSize = WINDOW_SIZE / 2;
        g.drawImage(fireflyImage, (WINDOW_SIZE - imageSize) / 2, (WINDOW_SIZE - imageSize) / 2, imageSize, imageSize, null);
    }

    public static void main(String[] args) {
        int x = 0; // Beispielkoordinate
        int y = 0; // Beispielkoordinate

        // Starte den Glühwürmchenprozess
        FireflyProcess firefly = new FireflyProcess(x, y);
        Thread fireflyThread = new Thread(firefly);
        fireflyThread.start();
    }
}
