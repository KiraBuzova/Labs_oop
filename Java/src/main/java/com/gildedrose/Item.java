package com.gildedrose;

public class Item {

    public String name;

    public ExpirationDate expirationDate;

    public Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.expirationDate = new ExpirationDate(sellIn);
        this.quality = new Quality(quality);
    }

    @Override
    public String toString() {
        return this.name + ", " + expirationDate.getDays() + ", " + this.quality.getValue();
    }
}