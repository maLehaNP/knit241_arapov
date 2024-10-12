package org.knit.lab3;

public class Client {
    public void run() {
        WarriorTank warrior = new WarriorTank("Some Ork");
        Mage mage = new Mage("Some Mage");
        Priest priest = new Priest("Some Healer");

        mage.move(100, 100);
        warrior.attack(mage);
        priest.heal(mage);
        mage.castSpell(warrior);
        System.out.println(mage.toString());
    }
}
