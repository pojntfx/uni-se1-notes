package com.pojtinger.felicitas.hdm.exercises.advanced.objectsAndClasses.binominalsTheRecursiveWay;

public class BinominalCalculatorImpl implements BinominalCalculator {
    @Override
    public long getRecursive(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }

        return this.getRecursive(n - 1, k) + this.getRecursive(n - 1, k - 1);
    }
}
