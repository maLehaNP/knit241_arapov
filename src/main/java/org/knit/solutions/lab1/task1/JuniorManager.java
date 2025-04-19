package org.knit.solutions.lab1.task1;

// Конкретные обработчики
class JuniorManager extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return amount <= 1000;
    }

    @Override
    protected void approve(Complaint amount) {
        System.out.println("Младший менеджер одобрил запрос на $" + amount);
    }
}
