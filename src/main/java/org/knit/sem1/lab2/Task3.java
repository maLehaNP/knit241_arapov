package org.knit.sem1.lab2;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;

public class Task3 {
    public static void execute() {
        Calculator calculator = new Calculator();  // bla-bla
        Scanner scanner = new Scanner(System.in);  // Сканнер (ввод).
        double a = 0.0;
        String op = null;
        double b = 0.0;
        while (true) {
            try {
                System.out.print("Введите первое число: ");
                a = scanner.nextDouble();
                System.out.print("Введите оператор (+, -, *, /): ");
                op = scanner.next();
                if (op.equals("exit"))
                    throw new InputMismatchException();
                System.out.print("Введите второе число: ");
                b = scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Выход из программы.");
                exit(1);
            }
            switch (op){
                case "+":  System.out.printf("Результат: %f%n", calculator.add(a, b)); break;
                case "-":  System.out.printf("Результат: %f%n", calculator.substract(a, b)); break;
                case "*":  System.out.printf("Результат: %f%n", calculator.multiply(a, b)); break;
                case "/":
                    if (b == 0) {
                        throw new ArithmeticException("Деление на ноль невозможно.");
                    }
                    System.out.printf("Результат: %f%n", calculator.divide(a, b));
                    break;
            }
            System.out.printf("%n");
        }
    }
}
