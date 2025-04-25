package org.knit.solutions.lab4.task12;

public class TextEditor {
    private String text = "1";
    private final Caretaker caretaker = new Caretaker();

    public String getText() {
        return text;
    }

    public void addText(String text) {
        this.text = this.text + text;
    }

    public void saveState() {
        caretaker.putSnapshot(new Memento(text));
    }

    public void undo() {
        this.text = caretaker.getSnapshot().getTextSnapshot();
    }
}
