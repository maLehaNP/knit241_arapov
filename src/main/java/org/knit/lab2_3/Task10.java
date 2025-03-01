package org.knit.lab2_3;

import java.util.concurrent.*;

public class Task10 {
    public static void execute() {
        int runnerCount = 5;
        CyclicBarrier bar = new CyclicBarrier(runnerCount);
        ExecutorService executor = Executors.newFixedThreadPool(10);

        for (int i = 0; i < 5; i++) {
            int finalI = i;
            executor.submit(() -> new Runner(finalI, bar).run());
        }
        executor.shutdown();
        while (!executor.isTerminated());
        System.out.println("Гонка завершена");
    }
}
