package org.knit.lab2;

public class Container {
    double value;

    public Container(int value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    /// <summary>
    /// Проверяет, можно ли добавить новую фигуру.
    /// </summary>
    public void add(Shape shape) {
        if (shape.getVolume() <= value) {
            value -= shape.getVolume();
        } else {
            System.out.println("Фигуру невозможно добавить.");
        }
    }
}
