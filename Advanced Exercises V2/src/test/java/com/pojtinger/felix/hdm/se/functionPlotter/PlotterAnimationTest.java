package com.pojtinger.felicitas.hdm.se.functionPlotter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class PlotterAnimationTest {
    private Plotter plotter;

    @BeforeEach
    private void setUp() {
        this.plotter = new PlotterImpl();
    }

    @Disabled
    @Test
    void animateSineWave() throws InterruptedException {
        this.plotter.setYResolution(25);
        this.plotter.setXResolution(100);

        for (var i = 0; i < 1000; i++) {
            final var offset = i;

            System.out.println(this.plotter.getGraph((x) -> 10 * Math.sin(x + offset / 10)));

            Thread.sleep(50);

            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}