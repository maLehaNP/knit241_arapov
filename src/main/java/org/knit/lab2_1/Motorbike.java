package org.knit.lab2_1;

public class Motorbike implements Transport {
    @Override
    public String getSpecifications() {
        return "предназначен для быстрой доставки";
    }
    @Override
    public String toString() {
        return "мотоцикл" + " (" + getSpecifications() + ")";
    }
}
