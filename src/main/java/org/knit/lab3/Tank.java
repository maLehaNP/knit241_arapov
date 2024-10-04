package org.knit.lab3;

public class Tank extends Player {
    int maxHealth = 700;
    int damage = 65;
    int armor = 30;
    private int extraArmor = 10;

    public Tank (String name) {
        super(name);
    }

    public void reduceHealht(int points) {
        setHealth(getHealth() - points + armor + extraArmor);
    }
}
