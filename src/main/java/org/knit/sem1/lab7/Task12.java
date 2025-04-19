package org.knit.sem1.lab7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Task12 {
    public static void execute() {
        Path filePath = Paths.get("src/main/java/org/knit/lab7/sample12.txt");
        Path startPath = Paths.get("src/main/java/org/knit/lab7/countDir");

        try {
//            long lineCount = TextFileProcessor.countLines(filePath);
//            long wordCount = TextFileProcessor.countWords(filePath);
//            System.out.println("Количество строк: " + lineCount);
//            System.out.println("Количество слов: " + wordCount);

            Files.walkFileTree(startPath, new CountFileVisitor());
        } catch (IOException e) {
            System.out.println("Ошибка при обработке файла: " + e.getMessage());
        }
    }
}
