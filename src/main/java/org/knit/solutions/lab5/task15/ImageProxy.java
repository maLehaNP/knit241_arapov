package org.knit.solutions.lab5.task15;

import java.util.Objects;

public class ImageProxy extends Image {
    private RealImage realImage = new RealImage();
    private String ip;

    @Override
    public void downloadFromServer(String ip) {
        if (Objects.equals(ip, this.ip)) {
            System.out.println("Повторное использование кэшированного изображения");
        } else {
            realImage.downloadFromServer(ip);
            this.ip = ip;
        }
    }
}
