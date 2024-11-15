package org.knit.lab6;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.BufferedReader;

public class Task10 {
    public void execute() {
        ArrayList<String> dict = new ArrayList<String>();
        String filePath = "C:\\Users\\maleha\\IdeaProjects\\knit241\\src\\main\\java\\org\\knit\\lab6\\dictionary.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) dict.add(line);
        } catch (IOException e) {throw new RuntimeException(e);}
    }
}
