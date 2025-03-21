package org.knit.lab2_2;

public class Manufacturer implements Runnable {
    private final int maxProd = 5;
    Warehouse warehouse;

    public Manufacturer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println("Manufacturer produce good № " + warehouse.getGoods());
            warehouse.increment();
            if (warehouse.getGoods() == maxProd) {
                try {
                    System.out.println("Manufacturer waiting...");
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
