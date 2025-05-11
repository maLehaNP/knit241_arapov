package org.knit.solutions.lab4.task13;

public class LightOffCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Свет выключен");
    }
}
