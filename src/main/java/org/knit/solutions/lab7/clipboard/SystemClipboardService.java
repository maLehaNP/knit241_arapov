package org.knit.solutions.lab7.clipboard;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

@Service
public class SystemClipboardService implements ClipboardService {
    public void copyToClipboard(String password) {
        Toolkit.getDefaultToolkit()
                .getSystemClipboard()
                .setContents(new StringSelection(password), null);
    }
}
