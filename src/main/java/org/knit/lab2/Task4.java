package org.knit.lab2;

public class Task4 {
    public static class Container {
        double value;
//        Shape[] figures = new Shape[1];

        public Container(int value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

//        public Shape[] getFigures() {
//            return figures;
//        }

        /// <summary>
        ///
        /// </summary>
        public void add(Shape shape) {
            if (shape.getVolume() <= value) {
//                figures[figures.length - 1] = shape;
                value -= shape.getVolume();
            } else {
                System.out.println("Фигуру невозможно добавить.");
            }
        }
    }

    public static abstract class Shape {
        /// <summary>
        /// Возвращает объем фигуры.
        /// </summary>
        public abstract double getVolume();
    }

    public static class Sphere extends Shape {
        double r;

        public Sphere(int r) {
            this.r = r;
        }

        @Override
        public double getVolume() {
            return (double) 4 / 3 * Math.PI * Math.pow(r, 3);
        }
    }

    public static class Cube extends Shape {
        double a;

        public Cube(int a) {
            this.a = a;
        }

        @Override
        public double getVolume() {
            return Math.pow(a, 3);
        }
    }

    public static class Cylinder extends Shape {
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
}
