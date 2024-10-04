package org.knit.lab3;

public class Player {
    private String name;
    private int maxHealth;
    private int health = maxHealth;
    private boolean isAlive;
    private int x;
    private int y;
    private int damage;
    private int defence;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public boolean getAlive() {
        return isAlive;
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

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void increaseHealth(int value) {
        if ((maxHealth - health) < value) {
            System.out.printf("%s исцелился на %d HP (%d -> %d).%n", name, value, health, health + value);
            health = health + value;
        } else {
            System.out.printf("%s полностью исцелился на %d HP (%d -> %d).%n", name, value, health, maxHealth);
            health = maxHealth;
        }
    }

    public void decreaseHealth(int value) {
        System.out.printf("%s получил %d урона (%d -> %d).%n", name, value, health, health + defence - value);
        health = health + defence - value;
        if (health < 0) {
            isAlive = false;
            System.out.printf("%s мертв.%n", name);
        }
    }

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
