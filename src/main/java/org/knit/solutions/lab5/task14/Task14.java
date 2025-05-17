package org.knit.solutions.lab5.task14;

import org.knit.TaskDescription;
import org.knit.solutions.Solution;

/**
 * Задача:
 * Создайте систему управления файловыми объектами.
 * Есть три типа файловых объектов:
 *     Файлы,
 *     Папки,
 *     Ссылки (ярлыки).
 * Требуется реализовать два посетителя:
 *     Сканер вирусов, который проверяет каждый файл на наличие вирусов.
 *     Анализатор размера, который подсчитывает общий размер файлов (ссылки не учитываются).
 * 📌 Подсказка:
 * Каждый файл, папка и ссылка должны реализовывать интерфейс FileSystemElement. В accept() методе вызывается соответствующий метод визитера.
 */
@TaskDescription(taskNumber = 14, taskDescription = "Паттерн Визитер (Visitor)")
public class Task14 implements Solution {
    @Override
    public void execute() {
        Folder mainFolder = new Folder("Главная папка");
        Folder folder1 = new Folder("Подпапка 1");
        Folder folder2 = new Folder("Подпапка 2");
        File file1 = new File("1", 1);
        File file2 = new File("2", 2);
        file2.setContent("virus");
        File file3 = new File("3", 3);
        File file4 = new File("4", 4);
        file4.setContent("virus");
        Link link1 = new Link("1 - ярлык", file1);
        Link link2 = new Link("4 - ярлык", file4);

        mainFolder.add(folder1);
        mainFolder.add(file1);
        folder1.add(folder2);
        folder1.add(file2);
        folder1.add(file3);
        folder1.add(link1);
        folder2.add(file4);
        folder2.add(link2);

        VirusVisitor virusVisitor = new VirusVisitor();
        TotalSumVisitor totalSumVisitor = new TotalSumVisitor();

        mainFolder.accept(virusVisitor);
        mainFolder.accept(totalSumVisitor);
        System.out.println("Общий размер файлов = " + totalSumVisitor.getTotalSize());
    }
}
