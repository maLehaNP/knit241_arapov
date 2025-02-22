package org.knit.lab2_1;

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
