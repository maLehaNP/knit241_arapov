package org.knit.solutions.lab1.task1;

// Абстрактный класс обработчика
abstract class Approver {
    protected Approver nextApprover; // Следующий обработчик в цепочке

    public void setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
    }

    public void processRequest(Complaint complaint) {
        if (canApprove(complaint.getAmount())) {
            approve(complaint);
            System.out.println("Одобрен запрос: " + complaint.getDescription());
        } else if (nextApprover != null) {
            nextApprover.processRequest(complaint); // Передача запроса дальше
        } else {
            System.out.println("Запрос " + complaint.getDescription() + " отклонен: превышает лимит.");
        }
    }

    protected abstract boolean canApprove(int amount); // Проверка лимита
    protected abstract void approve(Complaint amount); // Логика одобрения
}
