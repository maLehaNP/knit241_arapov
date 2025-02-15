package org.knit.lab2_1;

// Конкретные декораторы (добавки)
public class Milk extends CoffeeDecorator {
    public Milk(Coffee coffee) {
        super(coffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.5; // Добавляем цену молока
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", молоко";
    }

    @Override
    public int getCalories() {
        return super.getCalories() + 50;
    }
}
