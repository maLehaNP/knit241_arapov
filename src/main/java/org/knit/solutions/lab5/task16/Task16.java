package org.knit.solutions.lab5.task16;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;

/**
 * Задача:
 * Реализуйте систему отображения символов текста на экране.
 * <p>
 * Каждый символ (Character) имеет внутреннее состояние (код символа) и внешнее состояние (координаты x, y и стиль).
 * Используйте Фабрику приспособленцев, чтобы повторно использовать объекты символов и уменьшить количество объектов, создаваемых в системе.
 * <p>
 * 📌 Подсказка:
 * Внешнее состояние передается в метод render(), а внутреннее хранится внутри объектов, создаваемых фабрикой.
 */
@TaskDescription(taskNumber = 16, taskDescription = "Паттерн Приспособленец (Flyweight)")
public class Task16 implements Solution {

    @Override
    public void execute() {
        CharacterFactory characterFactory = new CharacterFactory();
        String text = "Hello, foo";
        int x = 0;
        int y = 0;
        String fontStyle = "Times New Roman 14pt";

        for (char ch : text.toCharArray()) {
            Character flyweight = characterFactory.getCharacter(ch);
            flyweight.render(x, y, fontStyle);
            x++;
            if (x % 5 == 0) {
                x = 0;
                y++;
            }
        }
    }
}
