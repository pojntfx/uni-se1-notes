package com.pojtinger.felicitas.hdm.se.functionPlotter;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws InterruptedException, IOException {
        Plotter plotter = new PlotterImpl();

        plotter.setYResolution(25);
        plotter.setXResolution(100);

        for (var i = 0; i < 1000; i++) {
            final var offset = i;

            var graph = plotter.getGraph((x) -> 10 * Math.sin(x + offset / 10));

            System.out.print("\033[H\033[2J");
            System.out.println(graph);

            Thread.sleep(50);
        }
    }
}