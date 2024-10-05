package org.knit.lab3;

public class Warrior extends Player {
    public Warrior(String name) {
        super(name);
        setMaxHealth(1000);
        setHealth(getMaxHealth());
        setDamage(70);
        setDefence(30);
    }

    public void attack(Player player) {
        player.decreaseHealth(getDamage());
    }
}
