package org.knit.solutions.lab1.task2;

// Конкретная реализация кофе (базовый объект)
public class Espresso implements Coffee {
    @Override
    public double getCost() {
        return 2.5;
    }

    @Override
    public String getDescription() {
        return "Эспрессо";
    }

    @Override
    public int getCalories() {
        return 5;
    }
}
