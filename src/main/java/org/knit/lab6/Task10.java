package org.knit.lab6;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;

public class Task10 {
    public void execute() {
        ArrayList<String> wordDict = new ArrayList<String>();
        String filePath = "C:\\Users\\maleha\\IdeaProjects\\knit241\\src\\main\\java\\org\\knit\\lab6\\dictionary.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null)
                wordDict.add(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        gameSession(wordDict);
    }

    public void gameSession(ArrayList<String> wordDict) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ansWord = new ArrayList<String>();
        ansWord.addAll(Arrays.asList(wordDict.get(rand.nextInt(9)).split("")));
        ArrayList<String> word = new ArrayList<String>();
        HashSet<String> guessed = new HashSet<String>();
        int ansWordLen = ansWord.toArray().length;

        for (int i = 0; i < ansWordLen; i++) {
            word.add("_");
        }
        int attemptNum = 6;
        while (attemptNum != 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ansWordLen; i++) {
                sb.append(word.get(i)).append(" ");
            }
            System.out.println("Загаданное слово: " + sb);
            System.out.print("Введите букву: ");
            String let = scanner.next();
            int letIndex = ansWord.indexOf(let);
            if (letIndex != -1) {
                word.remove(letIndex);
                word.add(letIndex, ansWord.get(letIndex));
            }
            attemptNum--;
        }
    }
}
