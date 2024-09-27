package org.knit;

import org.knit.lab2.Task4;

public class Main {
    public static void main(String[] args) {
        Task4.Container container = new Task4.Container(1000);

        Task4.Shape sphere = new Task4.Sphere(5);   // Создаем сферу с радиусом 5
        Task4.Shape cube = new Task4.Cube(3);    // Создаем куб со стороной 3
        Task4.Shape sphere2 = new Task4.Sphere(5);
        System.out.println(sphere.getVolume());
        System.out.println(cube.getVolume());
        container.add(sphere);  // Проверяем, можно ли добавить сферу
        container.add(cube);    // Проверяем, можно ли добавить куб
        System.out.println(container.getValue());
        container.add(sphere2);
    }
}
