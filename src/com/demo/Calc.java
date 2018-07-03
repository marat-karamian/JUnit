package com.demo;

public class Calc {

    static double mem;

    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public void memPlus(double a) {
        mem = mem + a;
    }

    public void memMinus(double a) {
        mem = mem - a;
    }

    public double getMem() {
        return mem;
    }

    public void clearMem() {
        mem = 0;
    }
}
