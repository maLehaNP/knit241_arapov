package org.knit.lab2_2;

public class Consumer implements Runnable {
    Warehouse warehouse;

    public Consumer(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public void run() {
        while (warehouse.getGoods() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        warehouse.decrement();
    }
}
