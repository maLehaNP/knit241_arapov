package org.knit.lab2_1;

public class Size extends CoffeeDecorator {
    private String size = "SMALL";

    public Size(Coffee coffee, String size) {
        super(coffee);
        this.size = size.toUpperCase();
    }

    @Override
    public double getCost() {
        return super.getCost() + switch (size) {
            case "SMALL" -> 0.0;
            case "MEDIUM" -> 0.5;
            case "LARGE" -> 1.0;
            default -> 0.0;
        };
    }

    @Override
    public String getDescription() {
        return  size + " " + super.getDescription();
    }

    @Override
    public int getCalories() {
        return super.getCalories() + switch (size) {
            case "SMALL" -> 0;
            case "MEDIUM" -> 20;
            case "LARGE" -> 40;
            default -> 0;
        };
    }
}
