package org.knit.sem1.lab10;

import java.util.HashMap;
import java.util.Map;

public class Dictionary<K, V> {
    private Map<K, V> dict = new HashMap<>();

    public void put(K key, V value) {
        dict.put(key, value);
    }

    public void remove(K key) {
        dict.remove(key);
    }

    public V get(K key) {
        return dict.get(key);
    }
}
