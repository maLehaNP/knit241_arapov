package org.knit.lab2_2;

import java.util.concurrent.atomic.AtomicInteger;

public class Warehouse {
    private AtomicInteger goods = new AtomicInteger(0);

    public void increment() {
        goods.incrementAndGet(); // Не атомарно!
    }

    public void decrement() {
        goods.decrementAndGet(); // Не атомарно!
    }

    public int getGoods() {
        return goods.get();
    }
}
