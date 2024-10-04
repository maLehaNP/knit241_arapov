package org.knit.lab2;

public class Cube extends Shape {
    double a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }
}
