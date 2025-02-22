package org.knit.lab2_2;

import java.util.concurrent.BlockingQueue;

public class Stamper implements Runnable {
    private final BlockingQueue<Detail> stampingQeque;
    private int lastDetailId = 0;

    public Stamper(BlockingQueue<Detail> stampingQeque) {
        this.stampingQeque = stampingQeque;
    }

    @Override
    public void run() {
        while (lastDetailId < 10) {
            try {
                stampingQeque.add(new Detail(++lastDetailId));
                System.out.println("Сделал заготовку " + lastDetailId);
                Thread.sleep(1000);
                lastDetailId++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
