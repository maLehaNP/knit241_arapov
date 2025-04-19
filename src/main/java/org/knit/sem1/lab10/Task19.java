package org.knit.sem1.lab10;

import java.util.List;

public class Task19 {
    public static void execute() {
        Integer[] numbers = {1, 2, 3, 4, 5};
        System.out.println(findMax(numbers)); // 5

        String[] words = {"apple", "banana", "cherry"};
        System.out.println(findMax(words)); // cherry
    }

    public static <T extends Comparable<T>> T findMax(T[] array) {
        T max = array[0];
        for (T elem : array) {
            if (elem.compareTo(max) > 0) max = elem;
        }
        return max;
    }
}
