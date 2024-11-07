package com.gildedrose;

public class Item {
    public ItemName name;
    public ExpirationDate expirationDate;
    public Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = new ItemName(name);
        this.expirationDate = new ExpirationDate(sellIn);
        this.quality = new Quality(quality);
    }

    @Override
    public String toString() {
        return name.getValue() + ", " + expirationDate.getDays() + ", " + quality.getValue();
    }
}
