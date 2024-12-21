package org.knit.lab8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Task13 {
    public static void execute() {
        Scanner scan = new Scanner(System.in);
        List<User> users = new ArrayList<>();

        System.out.println("Добро пожаловать в систему управления пользователями!\n" +
                "Выберите действие:\n" +
                "1. Добавить нового пользователя\n" +
                "2. Показать всех пользователей\n" +
                "3. Сохранить список пользователей в файл\n" +
                "4. Загрузить список пользователей из файла\n" +
                "5. Выйти\n");
        while (true) {
            System.out.print("\nВведите номер действия: ");
            switch (scan.next()) {
                case "1" -> {
                    System.out.print("Введите имя пользователя: ");
                    String name = scan.next();
                    System.out.print("Введите возраст: ");
                    int age = scan.nextInt();
                    System.out.print("Введите email: ");
                    String email = scan.next();
                    users.add(new User(name, age, email));
                    System.out.println("Пользователь добавлен.");
                }
                case "2" -> {
                    System.out.println("Список пользователей:");
                    int num = 1;
                    for (User user : users) {
                        System.out.println(num + ". " + user);
                        num++;
                    }
                }
                case "3" -> {
                    try {
                        UserManager.saveUsers(users);
                        System.out.println("Список успешно сохранён в файл.");
                    } catch (IOException e) {System.out.println("Ошибка I/O");}
                }
                case "4" -> {
                    try {
                        List<User> loadedUsers = UserManager.loadUsers();
                        System.out.println("Список успешно загружен из файла.");
                    } catch (IOException e) {System.out.println("Ошибка I/O");}
                    catch (ClassNotFoundException e) {System.out.println("Ошибка при работе с классом");}
                }
                case "5" -> {
                    try {
                        UserManager.saveUsers(users);
                    } catch (IOException e) {}
                    System.out.println("Программа завершена. До свидания!");
                    exit(1);
                }
                default -> System.out.println("Неправильная опция.");
            }
        }
    }
}
