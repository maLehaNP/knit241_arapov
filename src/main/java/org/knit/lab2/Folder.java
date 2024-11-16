package org.knit.lab2;

import java.util.ArrayList;
import java.util.HashSet;

public class Folder extends FileSystemComponent {
    ArrayList<FileSystemComponent> content = new ArrayList<FileSystemComponent>();

    public Folder(String name) {
        this.name = name;
    }

    @Override
    public void add(FileSystemComponent component) {
        content.add(component);
        size += component.size;
    }

    @Override
    public void remove(FileSystemComponent component) {
        content.remove(component);
        size -= component.size;
    }

    @Override
    public void display(String indent) {
        System.out.printf("%s%s (%s bytes)%n", indent, name, size);
        for (FileSystemComponent component : content) {
            component.display("\t" + indent);
        }
    }
}
