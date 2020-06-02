package com.pojtinger.felicitas.hdm.exercises.advanced.objectsAndClasses.binominalsTheRecursiveWay;

public class BinomialCalculatorMultiplicative implements BinomialCalculator {
    @Override
    public long get(int n, int k) {
        if (n - k < k) {
            k = n - k;
        }

        long res = 1;
        for (var i = n - k + 1; i <= n; i++) {
            res *= i;
        }
        for (var i = 2; i <= k; i++) {
            res /= i;
        }

        return res;
    }
}
