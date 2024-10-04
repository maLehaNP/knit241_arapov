package org.knit.lab2;

public class File extends FileSystemComponent {
    String name;
    byte size;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public byte getSize() {
        return size;
    }

    @Override
    public void add(FileSystemComponent component) {

    }

    @Override
    public void remove(FileSystemComponent component) {

    }

    @Override
    public void display(String indent) {

    }
}
