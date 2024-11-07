package com.gildedrose;

public class Quality {
    private int value;

    public Quality(int value) {
        this.value = value;
    }

    public void increase() {
        if (value < 50) {
            value++;
        }
    }

    public void decrease() {
        if (value > 0) {
            value--;
        }
    }

    public int getValue() {
        return value;
    }
}