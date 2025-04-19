package org.knit.sem1.lab2;

public class Sphere extends Shape {
    double r;

    public Sphere(int r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (double) 4 / 3 * Math.PI * Math.pow(r, 3);
    }
}
