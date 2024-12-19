package org.knit.lab7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TextFileProcessor {
    // Метод для подсчета строк в файле
    public static long countLines(Path filePath) throws IOException {
        long lineCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        }
        return lineCount;
    }

    // Метод для подсчета слов в файле
    public static long countWords(Path filePath) throws IOException {
        long wordCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Разбиваем строку на слова, используя пробелы и другие разделители
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
        }
        return wordCount;
    }
}
