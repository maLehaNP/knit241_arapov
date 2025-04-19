package org.knit.solutions.lab1.task3;

public class TransportFactory {
    public static Transport createTransport(String type) {
        return switch (type) {
            case "business" -> new BusinessCar();
            case "family" -> new FamilyVan();
            case "delivery" -> new Motorbike();
            default -> throw new IllegalStateException("Unexpected value: " + type);
        };
    }
}
