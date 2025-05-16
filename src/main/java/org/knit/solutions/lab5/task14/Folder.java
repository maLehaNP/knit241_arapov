package org.knit.solutions.lab5.task14;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemElement {
    private String name;
    private ArrayList<FileSystemElement> elements = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(FileSystemElement element) {
        elements.add(element);
    }

    public void remove(FileSystemElement element) {
        elements.remove(element);
    }

    @Override
    public void accept(Visitor visitor) {
        System.out.println("Посещение папки \"" + name + "\"");
        for (FileSystemElement elem : elements) {
            elem.accept(visitor);
        }
    }
}
