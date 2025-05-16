package org.knit.solutions.lab4.task11;

public class MobileApp implements StockObserver {
    String name;

    public MobileApp(String name) {
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
