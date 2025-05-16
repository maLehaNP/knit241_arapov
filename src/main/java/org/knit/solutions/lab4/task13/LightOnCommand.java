package org.knit.solutions.lab4.task13;

public class LightOnCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Свет включен");
    }
}
