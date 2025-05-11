package org.knit.solutions.lab4.task13;

public class GoodNightCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Выключаем все приборы");
    }
}
