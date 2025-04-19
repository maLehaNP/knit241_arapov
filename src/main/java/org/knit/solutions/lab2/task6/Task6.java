package org.knit.solutions.lab2.task6;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;

/**
 * Полное описание задачи
 */
@TaskDescription(taskNumber = 6, taskDescription = "Железнодорожный переезд")
public class Task6 implements Solution {
    public void execute() {
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
