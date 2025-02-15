package org.knit.lab2_1;

class Director extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 50000; // Директор одобряет до 50,000
    }

    @Override
    protected void approve(Complaint amount) {
        System.out.println("Директор одобрил запрос на $" + amount);
    }
}
