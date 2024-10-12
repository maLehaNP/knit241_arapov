package org.knit.lab3;

public class Warrior extends Player {
    private double attackRadius = 100;  // 1 метр.

    public Warrior(String name) {
        super(name);
        setMaxHealth(1000);
        setHealth(getMaxHealth());
        setDamage(70);
        setDefence(30);
    }

    public void attack(Player player) {
        System.out.printf("%s атакует %s.%n", getName(), player.getName());
        double attackDistance = Math.sqrt(Math.pow(Math.abs(player.getX() - getX()), 2) + Math.pow(Math.abs(player.getY() - getY()), 2));
        if (attackRadius >= attackDistance)
            player.decreaseHealth(getDamage());
        else
            System.out.printf("%s промахнулся по %s.%n", getName(), player.getName());
    }
}
