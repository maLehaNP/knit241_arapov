package org.knit.solutions.lab4.task13;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;

import java.util.Scanner;

import static java.lang.System.exit;

/**
 * Задача 13: Реализация системы команд для управления умным домом
 * <p>
 * Вы разрабатываете систему управления "умным домом", где пользователь может выполнять различные команды, такие как включение/выключение света, управление телевизором и кондиционером.
 * <p>
 * Требуется:
 * <p>
 * Создать интерфейс Command, который определяет метод execute().
 * Реализовать классы команд:
 * LightOnCommand – включает свет.
 * LightOffCommand – выключает свет.
 * TVOnCommand – включает телевизор.
 * TVOffCommand – выключает телевизор.
 * Создать класс RemoteControl, который хранит команду и позволяет её выполнить.
 * Реализовать механизм отмены последней команды (undo).
 * <p>
 * Пример работы:
 * <p>
 * Пользователь нажимает кнопку "Включить свет" – выполняется LightOnCommand.
 * Затем нажимает "Выключить телевизор" – выполняется TVOffCommand.
 * Пользователь нажимает "Отменить последнюю команду" – телевизор снова включается.
 * <p>
 * Дополнительно: Реализуйте поддержку макрокоманд (например, кнопка "Спокойной ночи" выключает все приборы разом).
 */
@TaskDescription(taskNumber = 13, taskDescription = "Паттерн Command (Команда)")
public class Task13 implements Solution {
    @Override
    public void execute() {
        RemoteControl remoteControl = new RemoteControl();
        Scanner scanner = new Scanner(System.in);  // Сканнер (ввод).

        System.out.println("====== Команды =======");
        System.out.println("1. Включить свет");
        System.out.println("2. Выключить свет");
        System.out.println("3. Включить телевизор");
        System.out.println("4. Выключить телевизор");
        System.out.println("5. Спокойной ночи");
        System.out.println("6. Доброе утро");
        System.out.println("7. Отменить");
        while (true) {
            System.out.print("\nВыберите опцию: ");
            switch (scanner.next()) {
                case "1" -> remoteControl.lightOn();
                case "2" -> remoteControl.lightOff();
                case "3" -> remoteControl.TVOn();
                case "4" -> remoteControl.TVOff();
                case "5" -> remoteControl.goodNight();
                case "6" -> remoteControl.goodMorning();
                case "7" -> remoteControl.undo();
                default -> {
                    System.out.println("Нет такой команды");
                    exit(1);
                }
            }
        }
    }
}
