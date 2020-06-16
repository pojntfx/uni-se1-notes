package com.pojtinger.felicitas.hdm.se.functionPlotter;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws InterruptedException, IOException {
        try {
            Plotter plotter = new PlotterImpl();

            final var type = args[0];
            final var yResolution = Integer.valueOf(args[1]);
            final var xResolution = Integer.valueOf(args[2]);

            plotter.setYResolution(yResolution);
            plotter.setXResolution(xResolution);

            for (var i = 0; i < 1000; i++) {
                final var offset = i;

                var graph = plotter.getGraph((x) -> {
                    switch (type) {
                        case "cos":
                            return 10 * Math.cos(x + offset / 10);

                        case "sin":
                            return 10 * Math.sin(x + offset / 10);

                        case "exp":
                            plotter.setXStart(-20);
                            plotter.setXEnd(20);

                            return Math.pow(x, offset / 10);

                        case "log":
                            return 10 * Math.log(x + offset / 10);

                        default:
                            throw new Error(String.format("Type %s not supported", type));
                    }
                });

                System.out.print("\033[H\033[2J");
                System.out.println(graph);

                Thread.sleep(50);
            }
        } catch (Exception e) {
            System.out.println(e);

            System.out.println("Usage: <sin|cos|exp|log> <y-resolution> <x-resolution>");
        }
    }
}