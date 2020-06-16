package com.pojtinger.felicitas.hdm.se.functionPlotter;

import java.util.Arrays;

public class PlotterImpl implements Plotter {
    private int yResolution;
    private int xResolution;

    private double xLimit;
    private double yMultiplier = 1;

    @Override
    public void setYResolution(int yResolution) {
        this.yResolution = yResolution;
    }

    @Override
    public void setXResolution(int xResolution) {
        this.xResolution = xResolution;
    }

    @Override
    public void setXLimit(double xLimit) {
        this.xLimit = xLimit;
    }

    @Override
    public void setYMultiplier(double yMultiplier) {
        this.yMultiplier = yMultiplier;
    }

    @Override
    public String getGraph(PlotterYCalculator yCalc) {
        var screen = new String[this.xResolution][this.yResolution];
        var output = "";

        for (var i = 0; i < this.xResolution; i++) {
            Arrays.fill(screen[i], ".");

            var currentStep = ((double) i / this.xResolution) * this.xLimit;

            var currentValue = (int) Math
                    .round((this.yResolution / 2) + (this.yMultiplier * yCalc.operate(currentStep)));

            if (currentValue >= 0 && Math.abs(currentValue) < this.yResolution)
                screen[i][currentValue] = "x";
        }

        for (var i = this.yResolution - 1; i >= 0; i--) {
            for (var o = 0; o < this.xResolution; o++) {
                output += screen[o][i];
            }

            output += "\n";
        }

        return output;
    }
}