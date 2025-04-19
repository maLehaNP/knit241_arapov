package org.knit.sem1.lab10;

public class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getFirst() {
        return key;
    }

    public V getSecond() {
        return value;
    }

    public void setFirst(K item) {
        key = item;
    }

    public void setSecond(V item) {
        value = item;
    }

    /*public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }*/
}
