package org.knit.solutions.lab5.task14;

public class VirusVisitor extends Visitor {
    @Override
    public void visit(File element) {
        System.out.println("Элемент \"" + element.getName() + "\" имеет вирусы " + (element.getContent() == "virus"));
    }
}
