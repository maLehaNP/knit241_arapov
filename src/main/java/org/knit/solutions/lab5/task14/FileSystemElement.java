package org.knit.solutions.lab5.task14;

public interface FileSystemElement {
    void accept(Visitor visitor);
    String getName();
}
