package org.knit.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task7 {
    public Scanner ReadFile(String pathname) throws FileNotFoundException {
        File f = new File(pathname);
        System.out.println(f.exists());
        return new Scanner(f);
    }
    public void execute() {
        Scanner file = null;
        String[] words = new String[67774];
        char[] alphabet = new char[64];
        int[] frequency = new int[alphabet.length];
        try {
            file = ReadFile("C:\\Users\\maleha\\IdeaProjects\\knit241\\src\\main\\java\\org\\knit\\lab4\\misc\\dictionary.txt");
        } catch(FileNotFoundException e) {
            e.getMessage();
        }

        int i = 0;
        for (char ch = 'А'; ch <= 'я'; ch++) {
            alphabet[i] = ch;
            i++;
        }
        i = 0;
        while (file.hasNext()) {
            String word = file.nextLine();
            words[i] = word;
            i++;
            /*String[] wordSp = word.split("");
            for (int j = 0; j < alphabet.length; j++) {
                for (int k = 0; k < wordSp.length; k++) {
                    if (wordSp[k].equals(alphabet[j])) {
                        frequency[j] = frequency[j] + 1;
                    }
                }
            }*/
        }

        DictionaryStatistic dictStat = new DictionaryStatistic(words, alphabet);
        System.out.println(dictStat.getRandomWord());
        file.close();
    }
}
