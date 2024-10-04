package org.knit.lab3;

public class Mage extends Player {
    int maxHealth = 700;
    int damage = 60;
    int armor = 0;

    public Mage(String name) {
        super(name);
    }

    private void attackSpell(Player player) {
        player.reduceHealht(120);
    }
}
