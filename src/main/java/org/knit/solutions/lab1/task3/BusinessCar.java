package org.knit.solutions.lab1.task3;

public class BusinessCar implements Transport {
    @Override
    public String getSpecifications() {
        return "имеет комфортный салон и кожаные сиденья";
    }
    @Override
    public String toString() {
        return "бизнес-седан" + " (" + getSpecifications() + ")";
    }
}
