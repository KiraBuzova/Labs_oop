package com.gildedrose;

public class ExpirationDate {
    private final IntValue days;

    public ExpirationDate(int days) {
        this.days = new IntValue(days);
    }

    public void decrease() {
        days.set(days.get() - 1);
    }

    public boolean isExpired() {
        return days.get() < 0;
    }

    public int getDays() {
        return days.get();
    }
}
