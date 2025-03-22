package org.knit.lab2_2;

import javax.security.auth.callback.TextInputCallback;
import java.util.concurrent.*;

public class Task2_9 {
    public static void execute() {
        BlockingQueue<Detail> assemblingQueue = new LinkedBlockingQueue<>();
        BlockingQueue<Detail> stampingQueue = new LinkedBlockingQueue<>();
        BlockingQueue<Detail> warehouseQueue = new LinkedBlockingQueue<>();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        executorService.submit(new Stamper(stampingQueue, 5));
        executorService.submit(new Assembler(stampingQueue, assemblingQueue, 5));
        executorService.submit(new Operator(assemblingQueue, warehouseQueue));
    }
}
