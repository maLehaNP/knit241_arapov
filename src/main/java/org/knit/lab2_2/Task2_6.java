package org.knit.lab2_2;

public class Task2_6 {
    public static void execute() {
        Crossing crossing = new Crossing();
        final int carCount = 20;
        final int trainCount = 3;

        Thread threadCars = new Thread(() -> {
            for (int i = 1; i <= carCount; i++) {
                crossing.car(i);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread threadTrains = new Thread(() -> {
            for (int i = 1; i <= trainCount; i++) {
                crossing.train(i);
                try {
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        threadCars.start();
        threadTrains.start();
    }
}
