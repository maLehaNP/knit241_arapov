package org.knit.sem1.lab10;

public class Task22 {
    public static void execute() {
        Dictionary<String, Integer> dictionary = new Dictionary<>();
        dictionary.put("Alice", 25);
        dictionary.put("Bob", 30);
        dictionary.remove("Bob");
        System.out.println(dictionary.get("Alice")); // 25
    }
}
