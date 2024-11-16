package org.knit.lab3;

public class Mage extends Player {
    public Mage(String name) {
        super(name);
        setMaxHealth(700);
        setHealth(getMaxHealth());
        setDamage(60);
    }

    public void castSpell(Player player) {
        player.decreaseHealth(120);
    }
}
