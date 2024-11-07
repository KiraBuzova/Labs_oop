package com.gildedrose;

public class ExpirationDate {
    private int days;

    public ExpirationDate(int days) {
        this.days = days;
    }

    public void decrease() {
        days--;
    }

    public boolean isExpired() {
        return days < 0;
    }

    public int getDays() {
        return days;
    }
}