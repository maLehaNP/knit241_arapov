package org.knit.lab3;

public class Mage extends Player {
    int maxHealth = 700;
    int health = maxHealth;
    int damage = 60;
    int defence = 0;

    public Mage(String name) {
        super(name);
    }

    public void castSpell(Player player) {
        player.decreaseHealth(120);
    }
}
