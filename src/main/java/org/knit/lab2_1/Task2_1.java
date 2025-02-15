package org.knit.lab2_1;

public class Task2_1 {
    public static void execute() {
        // Создаем обработчиков
        Approver callCenter = new CallCenter();
        Approver junior = new JuniorManager();
        Approver senior = new SeniorManager();
        Approver director = new Director();

        // Устанавливаем цепочку: call center -> junior -> senior -> director
        callCenter.setNextApprover(junior);
        junior.setNextApprover(senior);
        senior.setNextApprover(director);

        // Создаем жалобы
        Complaint comp1 = new Complaint(0, "");
        Complaint comp2 = new Complaint(500, "Заблокировалась карта.");
        Complaint comp3 = new Complaint(5000, "Украли 100 руб.");
        Complaint comp4 = new Complaint(20000, "Списались все деньги.");
        Complaint comp5 = new Complaint(100000, "");

        // Запросы на одобрение разных сумм
        callCenter.processRequest(comp1); // Колл-центр одобряет
        callCenter.processRequest(comp2); // Младший менеджер одобряет
        callCenter.processRequest(comp3); // Старший менеджер одобряет
        callCenter.processRequest(comp4); // Директор одобряет
        callCenter.processRequest(comp5); // Превышает лимит – запрос отклонен
    }
}
