package org.knit.sem1.lab10;

public class Task23 {
    public static void execute() {
        printType(123); // java.lang.Integer
        printType("Hello"); // java.lang.String
    }

    public static <T> void printType(T obj) {
        System.out.println(obj.getClass().toString().replaceFirst("class ", ""));
    }
}
