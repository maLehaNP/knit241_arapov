package org.knit.lab3;

public class Priest extends Player {
    int maxHealth = 600;
    int damage = 50;
    int armor = 0;

    public Priest(String name) {
        super(name);
    }

    private void heal(Player player) {
        player.addHealth(300);
    }
}
