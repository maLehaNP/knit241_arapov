package org.knit.lab2_2;

import java.util.LinkedList;
import java.util.Queue;

public class Restaraunt {
    private final int CAPACITY = 3;
    private Queue<String> mealsQueue = new LinkedList<>();

    public synchronized void cook(String name) {
        while (mealsQueue.size() >= CAPACITY) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        mealsQueue.add(name);
        notify();
    }

    public synchronized void serve() {
        while (mealsQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Официант подал блюдо " + mealsQueue.poll());
    }
}
