package org.knit.lab2_1;

public class FamilyVan implements  Transport {
    @Override
    public String getSpecifications() {
        return "поддерживает перевозку 6+ пассажиров";
    }
    @Override
    public String toString() {
        return "минивэн" + " (" + getSpecifications() + ")";
    }
}
