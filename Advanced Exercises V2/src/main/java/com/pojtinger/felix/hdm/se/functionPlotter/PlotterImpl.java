package com.pojtinger.felicitas.hdm.se.functionPlotter;

import java.util.Arrays;

public class PlotterImpl implements Plotter {
    private int yResolution;
    private int xResolution;

    private int xLimit;

    @Override
    public void setYResolution(int yResolution) {
        this.yResolution = yResolution;
    }

    @Override
    public void setXResolution(int xResolution) {
        this.xResolution = xResolution;
    }

    @Override
    public void setXLimit(int xLimit) {
        this.xLimit = xLimit;
    }

    @Override
    public void printSineWave(int multiplier) {
        var screen = new String[this.xResolution][this.yResolution];

        for (var i = 0; i < this.xResolution; i++) {
            Arrays.fill(screen[i], ".");

            var currentStep = ((float) i / this.xResolution) * this.xLimit;

            var currentValue = (int) Math.round((this.yResolution / 2) + multiplier * Math.sin(currentStep));

            if (currentValue >= 0 && Math.abs(currentValue) < this.yResolution)
                screen[i][currentValue] = "x";
        }

        for (var i = 0; i < this.yResolution; i++) {
            for (var o = 0; o < this.xResolution; o++) {
                System.out.print(screen[o][i]);
            }

            System.out.println();
        }

    }
}