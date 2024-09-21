package org.knit;

import org.knit.lab2.Task3;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task3.Calculator calculator = new Task3.Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        /*if (Objects.equals(scanner.next(), "exit")) {
            System.out.println("Выход из программы.");
            System.exit(1);
        }*/
        double a = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        String op = scanner.next();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        if (Objects.equals(op, "+")) {
            System.out.println("Результат: " + calculator.add(a, b));
        }
        if (Objects.equals(op, "-")) {
            System.out.println("Результат: " + calculator.substract(a, b));
        }
        if (Objects.equals(op, "*")) {
            System.out.println("Результат: " + calculator.multiply(a, b));
        }
        if (Objects.equals(op, "/")) {
            if (b == 0) {
                throw new ArithmeticException("Деление на ноль невозможно.");
            }
            System.out.println("Результат: " + calculator.divide(a, b));
        }
    }
}
