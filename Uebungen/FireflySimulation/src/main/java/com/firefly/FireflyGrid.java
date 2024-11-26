package com.firefly;

import java.util.ArrayList;
import java.util.List;

public class FireflyGrid {
    private final int gridSize;
    private final Firefly[][] grid;

    public FireflyGrid(int gridSize) {
        this.gridSize = gridSize;
        this.grid = new Firefly[gridSize][gridSize];
        initializeGrid();
        setNeighbors();
    }

    private void initializeGrid() {
        for (int x = 0; x < gridSize; x++) {
            for (int y = 0; y < gridSize; y++) {
                double initialPhase = Math.random() * 2 * Math.PI; // Zufällige Phase
                grid[x][y] = new Firefly(x, y, initialPhase);
            }
        }
    }

    private void setNeighbors() {
        for (int x = 0; x < gridSize; x++) {
            for (int y = 0; y < gridSize; y++) {
                List<Firefly> neighbors = new ArrayList<>();
                neighbors.add(grid[(x - 1 + gridSize) % gridSize][y]); // Oben
                neighbors.add(grid[(x + 1) % gridSize][y]); // Unten
                neighbors.add(grid[x][(y - 1 + gridSize) % gridSize]); // Links
                neighbors.add(grid[x][(y + 1) % gridSize]); // Rechts
                grid[x][y].setNeighbors(neighbors);
            }
        }
    }

    public Firefly[][] getGrid() {
        return grid;
    }
}
