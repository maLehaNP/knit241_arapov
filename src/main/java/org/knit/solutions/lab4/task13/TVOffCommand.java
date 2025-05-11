package org.knit.solutions.lab4.task13;

public class TVOffCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Телевизор выключен");
    }
}
