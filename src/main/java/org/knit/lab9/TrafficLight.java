package org.knit.lab9;

public enum TrafficLight {
    RED("YELLOW"),
    YELLOW("GREEN"),
    GREEN("RED");
    private String nextLight;

    TrafficLight(String nextLight) {
        this.nextLight = nextLight;
    }
    public String getNextLight() {
        return nextLight;
    }
}
