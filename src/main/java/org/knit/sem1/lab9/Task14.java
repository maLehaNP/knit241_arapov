package org.knit.sem1.lab9;

import java.util.Scanner;

public class Task14 {
    public static void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текущий сигнал светофора (RED, YELLOW, GREEN): ");
        TrafficLight signal = TrafficLight.valueOf(scanner.next());
        System.out.println("Следующий сигнал: " + signal.getNextLight());
    }
}
