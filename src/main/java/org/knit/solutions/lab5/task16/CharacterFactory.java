package org.knit.solutions.lab5.task16;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    Map<Integer, Character> characters = new HashMap<>();

    public Character getCharacter(int code) {
        characters.putIfAbsent(code, new Character(code));
        return characters.get(code);
    }
}
