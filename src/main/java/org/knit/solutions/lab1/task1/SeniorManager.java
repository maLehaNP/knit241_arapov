package org.knit.solutions.lab1.task1;

class SeniorManager extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 10000;
    }

    @Override
    protected void approve(Complaint amount) {
        System.out.println("Старший менеджер одобрил запрос на $" + amount);
    }
}
