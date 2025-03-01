package org.knit.lab2_2;

public class Manufacturer implements Runnable {
    private final int maxProd = 5;
    Warehouse warehouse;

    public Manufacturer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (warehouse.getGoods() == maxProd) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        warehouse.increment();
    }
}
