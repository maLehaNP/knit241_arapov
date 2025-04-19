package org.knit.sem1.lab2;

public class Task4 {
    public static void execute() {
        Container container = new Container(1000);

        Shape sphere = new Sphere(5);   // Создаем сферу с радиусом 5
        Shape cube = new Cube(3);    // Создаем куб со стороной 3
        Shape sphere2 = new Sphere(5);
        System.out.println(sphere.getVolume());
        System.out.println(cube.getVolume());
        container.add(sphere);  // Проверяем, можно ли добавить сферу
        container.add(cube);    // Проверяем, можно ли добавить куб
        System.out.println(container.getValue());
        container.add(sphere2);
    }
}
