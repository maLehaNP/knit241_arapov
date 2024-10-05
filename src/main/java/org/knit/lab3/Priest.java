package org.knit.lab3;

public class Priest extends Player {
    public Priest(String name) {
        super(name);
        setMaxHealth(600);
        setHealth(getMaxHealth());
        setDamage(50);
    }

    public void heal(Player player) {
        player.increaseHealth(300);
    }
}
