package org.knit.lab3;

public class Client {
    public void run() {
        WarriorTank warrior = new WarriorTank("Some Ork");
        Mage mage = new Mage("Some Mage");
        Priest priest = new Priest("Some Healer");

        warrior.attack(mage);
        priest.heal(mage);
        mage.castSpell(warrior);
        System.out.println(mage.toString());
        mage.move(2, 2);
        warrior.attack(mage);
        warrior.move(1, 1);
        warrior.attack(mage);
    }
}
