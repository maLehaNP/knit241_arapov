package org.knit.lab2_2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Task2_7 {
    public void execute() {
        Restaraunt restaraunt = new Restaraunt();
        final int dishCount = 10;

        Warehouse warehouse = new Warehouse();
        int prodCount = 10;

        Thread threadProducer = new Thread(() -> {
            for (int i = 0; i < prodCount; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                warehouse.produce(i);
            }
        });
        Thread threadConsumer = new Thread(() -> {
            for (int i = 0; i < prodCount; i++) {
                warehouse.consume();
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread producer = new Thread(() -> {
            try {
                while (true) {
                    warehouse.put(prodCount);
                    System.out.println("Produce good " + prodCount);
                    prodCount++;
                    Thread.sleep( 500);
                    if (warehouse.size() == maxProd) {
                        System.out.println("Producer waiting...");
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Producer прерван!");
            }
        });

        Thread consumer = new Thread(() -> {
            try {
                while (true) {
                    int item = warehouse.take(); // Блокирующий вызов
                    System.out.println("Consumer buy " + item);
                    Thread.sleep(1000);
                    if (warehouse.size() == 0) {
                        System.out.println("Consumer waiting...");
                        wait();
                    }
                }
            } catch (InterruptedException e) {
                System.out.println("Producer прерван!");
            }
        });



        producer.start();
        consumer.start();
        /*Warehouse warehouse = new Warehouse();
        Manufacturer manufacturer = new Manufacturer(warehouse);
        Consumer consumer = new Consumer(warehouse);

        Thread thread1 = new Thread(manufacturer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();*/
    }
}
