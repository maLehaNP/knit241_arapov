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
        System.out.printf("%s%s (%d b)%n", indent.substring(0, indent.length() / 2), name, size);
        for (FileSystemComponent component : content) {
            if (component.getClass() == File.class) {
                System.out.printf("%s%s (%d b)%n", indent, component.getName(), component.getSize());
            }
            if (component.getClass() == Folder.class) {
                component.display(indent + indent);
            }
        }
    }
}
