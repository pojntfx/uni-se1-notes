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
    void printSineWave() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> 10 * Math.sin(x)));
    }

    @Test
    void printCosineWave() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> 10 * Math.cos(x)));
    }

    @Test
    void printExponential() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> Math.pow(x, 2)));
    }

    @Test
    void printExponentialInverted() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> -Math.pow(x, 2)));
    }

    @Test
    void printParabola() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXStart(-20);
        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> Math.pow(x, 2)));
    }

    @Test
    void printParabolaInverted() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXStart(-20);
        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> -Math.pow(x, 2)));
    }

    @Test
    void printConstant() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> 1));
    }

    @Test
    void printLine() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> x));
    }

    @Test
    void printLog() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setXEnd(20);

        System.out.println(this.plotter.getGraph((x) -> Math.log(x)));
    }

    @Test
    void printSineWaveWithCutoff() {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        this.plotter.setYMultiplier(2);
        this.plotter.setXEnd(5);

        System.out.println(this.plotter.getGraph((x) -> 14 * Math.sin(x)));
    }
}