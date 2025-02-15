package org.knit.lab2_1;

public class Complaint {
    private int amount;
    private String description;

    public Complaint(int amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Complaint{" +
                "amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }
}
