package org.knit.lab2_2;

public class Consumer implements Runnable {
    Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Consumer buy good № " + warehouse.getGoods());
            warehouse.decrement();
            if (warehouse.getGoods() == 0) {
                try {
                    System.out.println("Consumer waiting...");
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
