/***********************************/
/*** Simon Szulik  ******  1474315 */
/*** Softwarearchitecture WS 24/25 */
/***********************************/
package com.firefly;

import java.util.List;

public class Firefly implements Runnable {
    // Firefly Position
    private final int x, y;
    private List<Firefly> neighbors;

    // Phasen Variabeln
    private double phase;
    private double omega = 1; // Eigenfrequenz
    private final double K = 0.1; // Kopplungsstärke

    // Synchronisation
    private final Object lock = new Object(); // Threadsicherheit

    public Firefly(int x, int y, double initialPhase) {
        this.x = x;
        this.y = y;
        this.phase = initialPhase;
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
            return (Math.sin(this.phase) + 1) / 2;
        }
    }

    private void updatePhase() {
        synchronized (lock) {
            double influence = 0;
            for (Firefly neighbor : neighbors) {
                influence += Math.sin(neighbor.getPhase() - this.phase);
            }
            this.phase += omega + K * influence;
            this.phase = this.phase % (2 * Math.PI);
        }
    }

    public double getPhase() {
        return phase;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
