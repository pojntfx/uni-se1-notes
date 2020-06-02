package com.pojtinger.felicitas.hdm.exercises.advanced.objectsAndClasses.binominalsTheRecursiveWay;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class BinominalCalculatorImplTest {
    BinominalCalculator calc;
    List<List<Integer>> cases = List.of(
            List.of(0, 0, 1),
            List.of(1, 0, 1),
            List.of(1, 1, 1),
            List.of(5, 1, 5),
            List.of(5, 2, 10),
            List.of(1234, 3, 312419184)
    );

    @Test
    public void getRecursive() {
        this.cases.forEach(c -> {
            var res = calc.getRecursive(c.get(0), c.get(1));

            assertEquals(Long.valueOf(c.get(2)), Long.valueOf(res));
        });
    }

    @Before
    public void setUp() {
        this.calc = new BinominalCalculatorImpl();
    }
}