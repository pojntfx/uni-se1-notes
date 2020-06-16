package com.pojtinger.felicitas.hdm.se.functionPlotter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlotterTest {
    private Plotter plotter;

    @BeforeEach
    private void setUp() {
        this.plotter = new PlotterImpl();
    }

    @Test
    void printSineWave() {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXLimit(20);

        this.plotter.printSineWave(8);
    }
}