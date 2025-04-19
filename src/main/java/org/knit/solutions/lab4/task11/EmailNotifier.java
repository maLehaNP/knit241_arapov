package org.knit.solutions.lab4.task11;

public class EmailNotifier implements StockObserver {
    @Override
    public void notifyUsers(Stock stock, float oldPrice, float newPrice) {
        for (User user : users) {
            String message = String.format("s", stock.getName(), oldPrice, newPrice);
            user.sendMessage(this, "");
        }
    }
}
