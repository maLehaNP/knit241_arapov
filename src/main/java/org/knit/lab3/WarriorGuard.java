package org.knit.lab3;

public class WarriorGuard extends Warrior {
    public WarriorGuard(String name) {
        super(name);
        setMaxHealth(600);
        setHealth(getMaxHealth());
        setDamage(70);
    }
}
