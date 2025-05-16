package org.knit.solutions.lab4.task12;

import java.util.Stack;

public class Caretaker {
    private Stack<Memento> snapshotStack = new Stack<>();

    public void putSnapshot(Memento memento) {
        snapshotStack.addElement(memento);
    }

    public Memento getSnapshot() {
        return snapshotStack.pop();
    }
}
