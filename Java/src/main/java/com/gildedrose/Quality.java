package com.gildedrose;

public class Quality {
    private final IntValue value;

    public Quality(int value) {
        this.value = new IntValue(value);
    }

    public void increase() {
        if (value.get() < 50) {
            value.set(value.get() + 1);
        }
    }

    public void decrease() {
        if (value.get() > 0) {
            value.set(value.get() - 1);
        }
    }

    public int getValue() {
        return value.get();
    }
}
