package org.knit.lab2_1;

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
