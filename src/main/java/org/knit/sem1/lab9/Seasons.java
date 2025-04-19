package org.knit.sem1.lab9;

public enum Seasons {
    WINTER("Холодно", "Новый год"),
    SUMMER("Жарко", "День защиты детей"),
    AUTUMN("Прохладно", "Тыквенный спас"),
    SPRING("Тепло", "День Победы");

    private final String temp;
    private final String holiday;

    Seasons (String weather, String holiday) {
        this.temp = weather;
        this.holiday = holiday;
    }

    public String getWeather() {
        return temp;
    }

    public String getHoliday() {
        return holiday;
    }
}
