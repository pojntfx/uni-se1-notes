package com.pojtinger.felicitas.hdm.se.functionPlotter;

public interface Plotter {
    void setYResolution(int yResolution);

    void setXResolution(int xResolution);

    void setXLimit(float xLimit);

    void setYMultiplier(float yMultiplier);

    String printSineWave(float multiplier);
}