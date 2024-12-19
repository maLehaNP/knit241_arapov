package org.knit.lab10;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Number> {
    private List<T> items = new ArrayList<>();

    public void add(T elem) {
        items.add(elem);
    }

    public double sum() {
        double sum = 0;
        for (Number number : items) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
