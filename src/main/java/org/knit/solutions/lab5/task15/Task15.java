package org.knit.solutions.lab5.task15;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;

/**
 * Задача:
 * Создайте удаленную библиотеку изображений.
 *
 *     При запросе изображения оно загружается с сервера (имитация через задержку в коде).
 *     Картинка хранится как объект класса RealImage.
 *     Прокси-объект ImageProxy должен лениво загружать изображение и кэшировать его для повторного использования.
 *
 * 📌 Подсказка:
 * ImageProxy должен проверять, создан ли объект RealImage. Если нет — создавать его.
 */
@TaskDescription(taskNumber = 15, taskDescription = "Паттерн Прокси (Proxy)")
public class Task15 implements Solution {

    @Override
    public void execute() {
        Image image = new ImageProxy();
        image.downloadFromServer("124.364.34.65");
        image.downloadFromServer("124.364.34.65");
    }
}
