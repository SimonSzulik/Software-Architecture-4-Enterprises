package com.firefly;

import javax.swing.*;
import java.awt.*;

public class Main extends JPanel {
    private final FireflyGrid fireflyGrid;
    private final int cellSize = 80; // Zellengröße in Pixeln
    private final Image brightFirefly;
    private final Image darkFirefly;

    public Main(int gridSize) {
        this.fireflyGrid = new FireflyGrid(gridSize);
        this.brightFirefly = new ImageIcon("resources/an.jpeg").getImage(); // Helles Glühwürmchen
        this.darkFirefly = new ImageIcon("resources/aus.jpeg").getImage(); // Dunkles Glühwürmchen
        startFireflyThreads();
    }

    private void startFireflyThreads() {
        for (Firefly[] row : fireflyGrid.getGrid()) {
            for (Firefly firefly : row) {
                new Thread(firefly).start();
            }
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Firefly[][] grid = fireflyGrid.getGrid();

        for (Firefly[] row : grid) {
            for (Firefly firefly : row) {
                Image fireflyImage = firefly.getBrightness() > 0.5 ? brightFirefly : darkFirefly;
                g.drawImage(fireflyImage, firefly.getX() * cellSize, firefly.getY() * cellSize, cellSize, cellSize, null);
            }
        }

        // Automatische Neuzeichnung
        repaint();
    }

    public static void main(String[] args) {
        int gridSize = 10; // Größe des Gitters
        JFrame frame = new JFrame("Glühwürmchen-Synchronisation");
        Main simulationPanel = new Main(gridSize);

        frame.add(simulationPanel);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
