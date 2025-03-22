package org.knit.lab2_2;

public class Task2_8 {
    public static void execute() {
        Crossroads crossroads = new Crossroads();
        final int carCount = 30;
        final int lightCount = 5;

        Thread threadTrafficLight = new Thread(() -> {
            try {
                for (int i = 1; i <= lightCount; i++) {
                    crossroads.trafficLight(i);
                    Thread.sleep(5000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread threadCars = new Thread(() -> {
            try {
                for (int i = 1; i <= carCount; i++) {
                    crossroads.car(i);
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        threadTrafficLight.start();
        threadCars.start();
    }
}
