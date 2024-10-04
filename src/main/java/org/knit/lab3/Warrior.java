package org.knit.lab3;

public class Warrior extends Player {
    int maxHealth = 1000;
    int health = maxHealth;
    int damage = 70;
    int defence = 30;

    public Warrior(String name) {
        super(name);
    }

    public void attack(Player player) {
        player.decreaseHealth(damage);
    }
}
