package org.knit.lab3;

public class Warrior extends Player {
    int maxHealth = 1000;
    int damage = 70;
    int armor = 30;

    public Warrior(String name) {
        super(name);
    }

    private void attack(Player player) {
        player.reduceHealht(damage);
    }
}
