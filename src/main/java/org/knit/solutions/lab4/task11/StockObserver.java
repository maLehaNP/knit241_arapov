package org.knit.solutions.lab4.task11;

public interface StockObserver {
    String getName();

    default void Subscribe(Stock stock) {
        stock.addObserver(this);
    }

    default void Unsubscribe(Stock stock) {
        stock.removeObserver(this);
    }

    void notifyUsers(Stock stock, double oldPrice, double newPrice);
}
