package org.knit.lab2;

public class Container {
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
    public void add(Task4.Shape shape) {
        if (shape.getVolume() <= value) {
//                figures[figures.length - 1] = shape;
            value -= shape.getVolume();
        } else {
            System.out.println("Фигуру невозможно добавить.");
        }
    }
}
