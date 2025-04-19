package org.knit.sem1.lab6;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.io.BufferedReader;

public class Task10 {
    public static void execute() {
        ArrayList<String> wordDict = new ArrayList<>();
        String filePath = "src/main/java/org/knit/lab6/dictionary.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null)
                wordDict.add(line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        gameSession(wordDict);
    }

    public static void gameSession(ArrayList<String> wordDict) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int wordDictLen = wordDict.toArray().length;

        ArrayList<String> ansWord = new ArrayList<>(Arrays.asList(wordDict.get(rand.nextInt(wordDictLen)).split("")));
        int ansWordLen = ansWord.toArray().length;

        ArrayList<String> word = new ArrayList<>();
//        HashSet<String> guessed = new HashSet<>();

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
                if (word.equals(ansWord)) {
                    System.out.println("Победа!");
                    break;
                }
            } else {
                attemptNum--;
                System.out.println("Неверно! Осталось попыток: " + attemptNum);
            }
        }
        System.out.print("Продолжить игру? (да): ");
        String cont = scanner.next();
        if (Objects.equals(cont, "да")) {
            gameSession(wordDict);
        } else System.out.println("Конец игры.");
    }
}
