package org.knit.sem1.lab10;

public class Task18 {
    public static void execute() {
        Pair<String, Integer> pair = new Pair<>("Age", 30);
        System.out.println(pair.getFirst()); // Age
        System.out.println(pair.getSecond()); // 30
        pair.setSecond(35);
        System.out.println(pair.getSecond()); // 35
    }
}
