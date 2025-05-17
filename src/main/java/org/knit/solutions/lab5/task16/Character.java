package org.knit.solutions.lab5.task16;

public class Character {
    private final int code;

    public Character(int code) {
        this.code = code;
    }

    public void render(int x, int y, String style) {
        System.out.printf("Символ \"%c\" отображен на координатах (%d, %d) со стилем \"%s\"%n", (char) code, x, y, style);
    }
}
