package org.knit.lab3;

public class Player {
    private String name;
    private int maxHealth;
    private int health;
    private boolean isAlive = true;
    private int x;
    private int y;
    private int damage;
    private int defence;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {return name;}
    public int getHealth() {return health;}
    public int getMaxHealth() {return maxHealth;}
    public boolean getAlive() {return isAlive;}
    public int getX() {return x;}
    public int getY() {return y;}
    public int getDamage() {return damage;}
    public int getDefence() {return defence;}

    public void setName(String name) {this.name = name;}
    public void setHealth(int health) {this.health = health;}
    public void setMaxHealth(int maxHealth) {this.maxHealth = maxHealth;}
    public void setAlive(boolean alive) {isAlive = alive;}
    public void setX(int x) {this.x = x;}
    public void setY(int y) {this.y = y;}
    public void setDamage(int damage) {this.damage = damage;}
    public void setDefence(int defence) {this.defence = defence;}

    @Override
    public String toString() {
        return name + " " + health + "HP " + "Alive=" + isAlive
                + " (" + x + ", " + y + ")";
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
        System.out.printf("%s перешел на позицию (%d, %d) ((%d, %d) -> (%2$d, %3$d)).%n", name, x, y, this.x, this.y);
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return name + " | "
                + "HP: " + health  + " | "
                + "POS: (" + x + ", " + y + ")";
    }
}
