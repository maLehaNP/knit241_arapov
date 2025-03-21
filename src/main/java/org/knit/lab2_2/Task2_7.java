package org.knit.lab2_2;

public class Task2_7 {
    public static void execute() {
        Shop shop = new Shop();
        int prodCount = 10;

        Thread threadProducer = new Thread(() -> {
            try {
                for (int i = 0; i < prodCount; i++) {
                    Thread.sleep(400);
                    shop.produce(i);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread threadConsumer = new Thread(() -> {
            try {
                for (int i = 0; i < prodCount; i++) {
                    shop.consume();
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        threadProducer.start();
        threadConsumer.start();
    }
}
