package com.pojtinger.felicitas.hdm.exercises.advanced.objectsAndClasses.binominalsTheRecursiveWay;

public class BinomialCalculatorRecursive implements BinomialCalculator {
    @Override
    public long get(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return this.get(n - 1, k) + this.get(n - 1, k - 1);
    }
}
