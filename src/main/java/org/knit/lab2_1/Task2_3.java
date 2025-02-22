package org.knit.lab2_1;

public class Task2_3 {
    public static void execute() {
        Transport business = TransportFactory.createTransport("business");
        Transport family = TransportFactory.createTransport("family");
        Transport delivery = TransportFactory.createTransport("delivery");
        System.out.println("Бизнесмен получит для деловой поездки " + business);
        System.out.println("Семья получит для отдыха " + family);
        System.out.println("Курьер получит для экспресс-доставки " + delivery);
    }
}
