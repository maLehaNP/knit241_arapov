package org.knit;

import org.knit.lab2.Task3;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Task3.Calculator calculator = new Task3.Calculator();
        Scanner scanner = new Scanner(System.in);  // Сканнер (ввод).
        double a = 0.0;
        String op = null;
        double b = 0.0;
        try {
            System.out.print("Введите первое число: ");
            a = scanner.nextDouble();
            System.out.print("Введите оператор (+, -, *, /): ");
            op = scanner.next();
            if (op.equals("exit")) throw new InputMismatchException();
            System.out.print("Введите второе число: ");
            b = scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Выход из программы.");
            exit(1);
        }
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
