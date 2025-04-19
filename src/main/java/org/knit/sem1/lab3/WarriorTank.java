package org.knit.sem1.lab3;

public class WarriorTank extends Warrior {
    private int additionalDefence = 10;

    public WarriorTank(String name) {
        super(name);
        setMaxHealth(700);
        setHealth(getMaxHealth());
        setDamage(65);
        setDefence(30);
    }

    @Override
    public void decreaseHealth(int value) {
        System.out.printf("%s получил %d урона (%d -> %d).%n", getName(), value, getHealth(), getHealth() + getDefence() + additionalDefence - value);
        setHealth(getHealth() + getDefence() + additionalDefence - value);
        if (getHealth() < 0) {
            setAlive(false);
            System.out.printf("%s мертв.", getName());
        }
    }
}
