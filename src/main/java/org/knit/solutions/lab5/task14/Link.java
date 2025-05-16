package org.knit.solutions.lab5.task14;

public class Link implements FileSystemElement {
    private String name;
    private FileSystemElement element;

    public Link(String name, FileSystemElement element) {
        this.name = name;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setElement(FileSystemElement element) {
        this.element = element;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor.getClass() != TotalSumVisitor.class) {
            System.out.println("Переход по ссылке \"" + name + "\" на элемент \"" + element.getName() + "\"");
            element.accept(visitor);
        }
    }
}
