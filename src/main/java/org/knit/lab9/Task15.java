package org.knit.lab9;

public class Task15 {
    public static void execute() {
        for (Seasons season : Seasons.values()) {
            System.out.println(season + ": " + season.getWeather() + ", " + season.getHoliday());
        }
    }
}
