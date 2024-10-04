package org.knit.lab3;

public class WarriorTank extends Warrior {
    int maxHealth = 700;
    int health = maxHealth;
    int damage = 65;
    int defence = 30;
    private int additionalDefence = 10;

    public WarriorTank(String name) {
        super(name);
    }

    @Override
    public void decreaseHealth(int value) {
        System.out.printf("%s получил %d урона (%d -> %d).%n", getName(), value, getHealth(), getHealth() + defence + additionalDefence - value);
        setHealth(getHealth() + defence + additionalDefence - value);
        if (getHealth() < 0) {
            setAlive(false);
            System.out.printf("%s мертв.", getName());
        }
    }
}
