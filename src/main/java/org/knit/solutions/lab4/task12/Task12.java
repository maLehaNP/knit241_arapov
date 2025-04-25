package org.knit.solutions.lab4.task12;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;

import java.util.Scanner;

import static java.lang.System.exit;


/**
 * Задача 12: Реализация системы отмены изменений в текстовом редакторе
 * <p>
 * Разработайте систему, позволяющую сохранять состояния текста в редакторе и откатывать изменения назад.
 * <p>
 * Требуется:
 * <p>
 * Создать класс TextEditor, который содержит текущий текст документа.
 * Создать класс Memento, который будет хранить снимок состояния текста.
 * Реализовать Caretaker, который управляет историей изменений (например, стек сохранённых состояний).
 * Реализовать методы saveState() и undo() для сохранения и отката изменений.
 * <p>
 * Пример работы:
 * <p>
 * Пользователь вводит текст "Hello, world!".
 * Он сохраняет текущее состояние.
 * Затем добавляет "How are you?".
 * Нажимает "Отменить" и возвращается к "Hello, world!".
 * <p>
 * Дополнительно: Реализуйте возможность нескольких уровней отката.
 */
@TaskDescription(taskNumber = 12, taskDescription = "Паттерн Memento (Хранитель)")
public class Task12 implements Solution {
    @Override
    public void execute() {
        TextEditor textEditor = new TextEditor();
        Scanner scanner = new Scanner(System.in);  // Сканнер (ввод).

        System.out.println("===== Меню ======");
        System.out.println("1. Вывести текст");
        System.out.println("2. Добавить текст");
        System.out.println("3. Сохранить");
        System.out.println("4. Отменить");
        while (true) {
            System.out.print("\nВыберите опцию: ");
            String input = scanner.next();
            switch (input) {
                case "1" -> System.out.println(textEditor.getText());
                case "2" -> {
                    System.out.println("Напишите текст и поставьте в конце # (текст добавиться через пробел):");
                    String text = scanner.useDelimiter("#").next();
                    textEditor.addText(text.replace('\n', ' '));
                    scanner.reset();
                    scanner.skip("#");
                }
                case "3" -> textEditor.saveState();
                case "4" -> textEditor.undo();
                default -> {
                    System.out.println("Неправильная опция: " + input);
                    exit(1);
                }
            }
        }
    }
}
