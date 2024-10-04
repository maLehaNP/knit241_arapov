package org.knit.lab2;

public abstract class FileSystemComponent {
    public abstract String getName();

    public abstract byte getSize();

    public abstract void add(FileSystemComponent component);

    public abstract void remove(FileSystemComponent component);

    public abstract void display(String indent);
}
