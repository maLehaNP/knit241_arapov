package org.knit.sem1.lab9;

public class Task16 {
    public static void execute() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                System.out.println(suit + " " + rank);
            }
        }
    }
}
