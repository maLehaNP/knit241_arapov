package org.knit.sem1.lab2;

public class Cylinder extends Shape {
    double r;
    double h;

    public Cylinder(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
