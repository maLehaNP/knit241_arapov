package org.knit.lab2;

public abstract class FileSystemComponent {
    String name = "";
    int size = 0;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public abstract void add(FileSystemComponent component);

    public abstract void remove(FileSystemComponent component);

    public abstract void display(String indent);
}
