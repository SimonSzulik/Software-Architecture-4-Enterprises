package com.firefly;

import java.awt.Color;
import java.util.List;

public class Firefly implements Runnable {
    private int x, y; // Position im Torus
    private double phase; // Aktuelle Phase
    private List<Firefly> neighbors; // Nachbarn
    private Color color; // Aktuelle Farbe
    private final double K = 1; // Kopplungsstärke
    private final Object lock = new Object(); // Threadsicherheit

    public Firefly(int x, int y, double initialPhase) {
        this.x = x;
        this.y = y;
        this.phase = initialPhase;
        this.color = Color.BLACK; // Initialfarbe
    }

    public void setNeighbors(List<Firefly> neighbors) {
        this.neighbors = neighbors;
    }

    @Override
    public void run() {
        while (true) {
            updatePhase();
            try {
                Thread.sleep(100); // Zeitschritt (100 ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public double getBrightness() {
        synchronized (lock) {
            return (Math.sin(this.phase) + 1) / 2; // Helligkeit normalisiert
        }
    }

    private void updatePhase() {
        synchronized (lock) {
            double influence = 0;
            for (Firefly neighbor : neighbors) {
                influence += Math.sin(neighbor.getPhase() - this.phase);
            }
            this.phase += K * influence;
            this.phase = this.phase % (2 * Math.PI); // Phase normalisieren
            updateColor();
        }
    }

    private void updateColor() {
        double brightness = (Math.sin(this.phase) + 1) / 2; // Helligkeit normalisiert
        int intensity = (int) (255 * brightness);
        this.color = new Color(intensity, intensity, 0); // Gelblich
    }

    public double getPhase() {
        return phase;
    }

    public Color getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
