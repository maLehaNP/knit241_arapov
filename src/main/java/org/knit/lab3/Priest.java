package org.knit.lab3;

public class Priest extends Player {
    int maxHealth = 600;
    int health = maxHealth;
    int damage = 50;
    int defence = 0;

    public Priest(String name) {
        super(name);
    }

    public void heal(Player player) {
        player.increaseHealth(300);
    }
}
