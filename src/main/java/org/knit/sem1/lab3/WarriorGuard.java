package org.knit.sem1.lab3;

public class WarriorGuard extends Warrior {
    public WarriorGuard(String name) {
        super(name);
        setMaxHealth(600);
        setHealth(getMaxHealth());
        setDamage(70);
    }
}
