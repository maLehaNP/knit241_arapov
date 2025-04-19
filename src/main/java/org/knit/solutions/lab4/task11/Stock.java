package org.knit.solutions.lab4.task11;

import java.util.ArrayList;
import java.util.List;

public class Stock {
    private String name;
    private double price;
    List<StockObserver> observers = new ArrayList<StockObserver>();

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        notifyObservers(this.price, price);
        this.price = price;
    }

    public void addObservers(StockObserver observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        } else System.out.println(observer.getName() + " уже подписан");

    }

    public void removeObservers(StockObserver observer) {
        if (observers.contains(observer)) {
            observers.remove(observer);
        } else System.out.println(observer.getName() + " не подписан");
    }

    private void notifyObservers(double oldPrice, double newPrice) {
        for (StockObserver observer : observers) {
            observer.notifyUsers(this, oldPrice, newPrice);
        }
    }
}
