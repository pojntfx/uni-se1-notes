package com.pojtinger.felicitas.hdm.exercises.advanced.objectsAndClasses.binominalsTheRecursiveWay;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinomialCalculatorTest {
    List<BinomialCalculator> calcs;
    List<List<Integer>> cases = List.of(
            List.of(0, 0, 1),
            List.of(1, 0, 1),
            List.of(1, 1, 1),
            List.of(5, 1, 5),
            List.of(5, 2, 10),
            List.of(1234, 3, 312419184)
    );

    @Test
    public void get() {
        this.calcs.forEach(calc -> this.cases.forEach(c -> {
            var res = calc.get(c.get(0), c.get(1));

            assertEquals(Long.valueOf(c.get(2)), Long.valueOf(res));
        }));
    }

    @Test
    public void speed() {
        this.calcs.forEach(calc -> {
            var start = System.nanoTime();

            this.cases.forEach(c -> calc.get(c.get(0), c.get(1)));

            var duration = System.nanoTime() - start;

            System.out.println(duration);
        });
    }

    @Before
    public void setUp() {
        this.calcs = List.of(new BinomialCalculatorRecursive(), new BinomialCalculatorMultiplicative());
    }
}