package org.knit.solutions.lab4.task11;

public class EmailNotifier implements StockObserver {
    String name;

    public EmailNotifier(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void notifyUsers(Stock stock, double oldPrice, double newPrice) {
        System.out.printf("%s: цена акции %s изменилась с %s на %s%n", name, stock.getName(), oldPrice, newPrice);
    }
}
