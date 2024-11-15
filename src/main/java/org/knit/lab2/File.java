package org.knit.lab2;

public class File extends FileSystemComponent {
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public void add(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void remove(FileSystemComponent component) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void display(String indent) {
        throw new UnsupportedOperationException();
    }
}
