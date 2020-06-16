package com.pojtinger.felicitas.hdm.se.functionPlotter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PlotterTest {
    private Plotter plotter;

    @BeforeEach
    private void setUp() {
        this.plotter = new Plotter();
    }

    @Test
    void sayHello() {
        var actual = this.plotter.sayHello();

        assertEquals("Hello!", actual);
    }
}