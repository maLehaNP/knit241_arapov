package org.knit.lab2_1;

public class CallCenter extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 100; // Колл-центр одобряет до 50,000
    }

    @Override
    protected void approve(Complaint amount) {
        System.out.println("Колл-центр одобрил запрос на $" + amount);
    }
}
