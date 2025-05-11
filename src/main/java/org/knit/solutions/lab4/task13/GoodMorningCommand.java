package org.knit.solutions.lab4.task13;

public class GoodMorningCommand implements Command  {
    @Override
    public void execute() {
        System.out.println("Включаем все приборы");
    }
}
