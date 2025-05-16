package org.knit.solutions.lab5.task15;

public class RealImage extends Image {
    @Override
    public void downloadFromServer(String ip) {
        System.out.println("Загрузка изображения с сервера " + ip);
        try {
        Thread.sleep(5000);
        System.out.println("Изображение загружено");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
