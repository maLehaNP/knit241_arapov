package org.knit.lab3;

public class Warrior extends Player {
    private int attackRadius = 2;

    public Warrior(String name) {
        super(name);
        setMaxHealth(1000);
        setHealth(getMaxHealth());
        setDamage(70);
        setDefence(30);
    }

    public void attack(Player player) {
        if (Math.pow(attackRadius, 2) >= Math.pow(Math.abs(getX() - player.getX()), 2) + Math.pow(Math.abs(getY() - player.getY()), 2))
            player.decreaseHealth(getDamage());
        else System.out.printf("%s промахнулся по %s.%n", getName(), player.getName());
    }
}
