package org.knit.lab6;

import java.util.Scanner;
import java.util.TreeSet;

import static java.lang.System.exit;

public class Task11 {
    public void execute() {
        TreeSet<String> students = new TreeSet<>();

        System.out.println("Меню:\n" +
                "1. Добавить студента\n" +
                "2. Удалить студента\n" +
                "3. Показать всех студентов\n" +
                "4. Найти студента\n" +
                "5. Выйти");
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.print("Выберите опцию: ");
            String option = scan.next();
            switch (option) {
                case "1": System.out.print("Введите имя студента: "); students.add(scan.nextLine()); break;
                case "2": System.out.print("Введите имя студента: ");
                    if (students.remove(scan.nextLine())) System.out.println("Студент удален.");
                    else System.out.println("Студент не найден.");
                    break;
                case "3": System.out.print("Список студентов:");
                    for (String student : students) System.out.println("\t" + student);
                    break;
                case "4":
                    System.out.print("Введите имя студента для поиска: ");
                    if (students.contains(scan.nextLine())) System.out.println("Студент найден.");
                    else System.out.println("Студент не найден.");
                    break;
                case "5": System.out.println("Выход из программы."); exit(1);
            }
        }
    }
}
