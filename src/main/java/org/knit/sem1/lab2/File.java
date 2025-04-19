package org.knit.sem1.lab2;

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
        System.out.printf("%s%s (%s bytes)%n", indent, name, size);
    }
}
