package com.pojtinger.felicitas.hdm.se.functionPlotter;

import java.util.Arrays;

public class PlotterImpl implements Plotter {
    private int yResolution;
    private int xResolution;

    private float xLimit;
    private float yMultiplier;

    @Override
    public void setYResolution(int yResolution) {
        this.yResolution = yResolution;
    }

    @Override
    public void setXResolution(int xResolution) {
        this.xResolution = xResolution;
    }

    @Override
    public void setXLimit(float xLimit) {
        this.xLimit = xLimit;
    }

    @Override
    public void setYMultiplier(float yMultiplier) {
        this.yMultiplier = yMultiplier;
    }

    @Override
    public String printSineWave(float multiplier) {
        var screen = new String[this.xResolution][this.yResolution];
        var output = "";

        for (var i = 0; i < this.xResolution; i++) {
            Arrays.fill(screen[i], ".");

            var currentStep = ((float) i / this.xResolution) * this.xLimit;

            var currentValue = (int) Math.round((this.yResolution / 2) + multiplier * Math.sin(currentStep));

            if (currentValue >= 0 && Math.abs(currentValue) < this.yResolution)
                screen[i][currentValue] = "x";
        }

        for (var i = 0; i < this.yResolution; i++) {
            for (var o = 0; o < this.xResolution; o++) {
                output += screen[o][i];
            }

            output += "\n";
        }

        return output;
    }
}