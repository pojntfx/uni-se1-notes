package com.pojtinger.felicitas.hdm.se.functionPlotter;

public interface Plotter {
    void setYResolution(int yResolution);

    void setXResolution(int xResolution);

    void setXLimit(int xLimit);

    void printSineWave(int multiplier);
}