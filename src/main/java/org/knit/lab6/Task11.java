package org.knit.lab6;

import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.System.exit;

public class Task11 {
    public void execute() {
        TreeSet<String> students = new TreeSet<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Меню:\n" +
                "1. Добавить студента\n" +
                "2. Удалить студента\n" +
                "3. Показать всех студентов\n" +
                "4. Найти студента\n" +
                "5. Выйти");
        while (true) {
            System.out.print("\nВыберите опцию: ");
            switch (scan.next()) {
                case "1" -> {
                    System.out.print("Введите имя студента: ");
                    String student = String.join(" ", scan.next(), scan.next());
                    if (students.add(student)) System.out.println("Студент добавлен.");
                    else System.out.println("Такой студент уже есть.");
                }
                case "2" -> {
                    System.out.print("Введите имя студента для удаления: ");
                    String student = String.join(" ", scan.next(), scan.next());
                    if (students.remove(student)) System.out.println("Студент удален.");
                    else System.out.println("Студент не найден.");
                }
                case "3" -> {
                    System.out.println("Список студентов:");
                    for (String student : students) System.out.println("- " + student);
                }
                case "4" -> {
                    System.out.print("Введите имя студента для поиска: ");
                    String student = String.join(" ", scan.next(), scan.next());
                    if (students.contains(student)) System.out.println("Студент найден.");
                    else System.out.println("Студент не найден.");
                }
                case "5" -> {
                    System.out.println("Выход из программы.");
                    exit(1);
                }
                default -> System.out.println("Неправильная опция.");
            }
        }
    }
}
