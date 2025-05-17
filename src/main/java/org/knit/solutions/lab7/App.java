package org.knit.solutions.lab7;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;
import org.knit.solutions.lab7.config.AppConfig;
import org.knit.solutions.lab7.security.MasterPasswordHolder;
import org.knit.solutions.lab7.service.PasswordService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

import static java.lang.System.exit;

@TaskDescription(taskNumber = 20, taskDescription = "Password Manager с Spring и шифрованием")
@Component
public class App implements Solution {
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        for (String beanDefinitionName : context.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }

        PasswordService passwordService = context.getBean(PasswordService.class);

        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            MasterPasswordHolder holder = context.getBean(MasterPasswordHolder.class);
            holder.clear(); // обнулить char[] в памяти
        }));

        System.out.println("======================= Список команд =========================");
        System.out.println("add — добавить запись (сайт, логин, пароль),");
        System.out.println("list — отобразить список сайтов и логинов (без паролей),");
        System.out.println("copy <site> — расшифровать пароль и скопировать в буфер обмена,");
        System.out.println("delete <site> — удалить запись по названию сайта,");
        System.out.println("exit — завершить программу.");

        while (true) {
            System.out.print("Введите команду: ");
            switch (scanner.next()) {
                case "add" -> {
                    System.out.print("Сайт: ");
                    String site = scanner.next();
                    System.out.print("Логин: ");
                    String login = scanner.next();
                    System.out.print("Пароль: ");
                    String password = scanner.next();
                    passwordService.add(site, login, password);
                }
                case "list" -> passwordService.list();
                case "copy" -> passwordService.copy(scanner.next());
                case "delete" -> passwordService.delete(scanner.next());
                case "exit" -> exit(1);
                default -> System.out.println("Неправильная опция");
            }
        }
    }
}
