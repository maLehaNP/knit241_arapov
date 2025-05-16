package org.knit.solutions.lab5.task14;

public class File implements FileSystemElement {
    private String name;
    private int size;
    private Object content = null;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Посещение файла \"" + getName() + "\"");
        visitor.visit(this);
    }
}
