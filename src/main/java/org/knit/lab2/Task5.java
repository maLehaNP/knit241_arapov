package org.knit.lab2;

public class Task5 {
    public void execute() {
        // Создаем файлы
        FileSystemComponent file1 = new File("file1.txt", 100);
        FileSystemComponent file2 = new File("file2.txt", 200);
        FileSystemComponent file3 = new File("file3.txt", 300);
        FileSystemComponent file4 = new File("file4.txt", 400);

        // Создаем папки
        FileSystemComponent folder1 = new Folder("Folder1");
        FileSystemComponent folder2 = new Folder("Folder2");
        FileSystemComponent folder3 = new Folder("Folder3");

        // Добавляем файлы в папки
        folder3.add(file4);

        folder1.add(file1);
        folder1.add(file2);
        folder1.add(folder3);

        folder2.add(file3);
        folder2.add(folder1); // Вложенная папка

        // Выводим структуру файловой системы
        folder2.display("\t");

        // Выводим общий размер папки 2
        System.out.println("Total size of Folder2: " + folder2.getSize() + " bytes");
    }
}
