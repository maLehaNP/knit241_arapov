package org.knit.lab2_2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class Warehouse {
    private Queue<Integer> mealsQueue = new LinkedList<>();
    private final int maxProd = 3;

    public synchronized void produce(int dishNum) {
        while (mealsQueue.size() >= maxProd) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        mealsQueue.add(dishNum);
        System.out.println("Повар приготовил блюдо " + dishNum);
        notify();
    }

    public synchronized void consume() {
        while (mealsQueue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Официант подал блюдо " + mealsQueue.poll());
        notify();
    }
}
