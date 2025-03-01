package org.knit.lab2_2;

public class Task2_7 {
    public static void execute() {
        Warehouse warehouse = new Warehouse();

        Thread manufacturer = new Thread(() -> {
            new Manufacturer(warehouse).run();
        });

        Thread consumer = new Thread(() -> {
            new Consumer(warehouse).run();
        });

        manufacturer.start();
        consumer.start();
//        manufacturer.join();
//        consumer.join();
    }
}
