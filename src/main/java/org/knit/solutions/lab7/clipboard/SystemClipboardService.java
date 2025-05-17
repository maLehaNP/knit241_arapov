package org.knit.solutions.lab7.clipboard;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

@Service
public class SystemClipboardService implements ClipboardService {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    Runnable clipboardCleaner = () -> Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection(""), null);  // Очистка буфера

    public void copyToClipboard(String password) {
        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(new StringSelection(password), null);

        scheduler.schedule(clipboardCleaner, 30, SECONDS);  // Автоматическая очистка буфера через 30 с
    }
}
