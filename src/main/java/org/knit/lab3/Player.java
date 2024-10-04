package org.knit.lab3;

public class Player {
    private String name;
    private int maxHealth;
    private int health = maxHealth;
    private boolean isAlive;
    private int x;
    private int y;
    private int damage;
    private int armor;

    public Player(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void addHealth(int points) {
        if ((maxHealth - health) < points) {
            System.out.printf("%s HP %d -> %d%n", name, health, health += points);
            health += points;
        } else {
            System.out.printf("%s HP %d -> %d%n", name, health, maxHealth);
            health = maxHealth;
        }
    }

    public void reduceHealht(int points) {
        health -= (points - armor);
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
