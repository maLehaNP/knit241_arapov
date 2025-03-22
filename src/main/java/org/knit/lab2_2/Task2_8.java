package org.knit.lab2_2;

public class Task2_8 {
    public static void execute() {
        Crossroads crossroads = new Crossroads();

        Thread threadTrafficLight = new Thread(new TrafficLight(crossroads, 5));
        Thread threadCars = new Thread(new Car(crossroads, 30));

        threadTrafficLight.start();
        threadCars.start();
    }
}
