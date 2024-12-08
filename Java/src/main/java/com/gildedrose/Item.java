package com.gildedrose;

public class Item {
    private final ItemName name;
    private final ExpirationDate expirationDate;
    private Quality quality;

    public Item(String name, int sellIn, int quality) {
        this.name = new ItemName(name);
        this.expirationDate = new ExpirationDate(sellIn);
        this.quality = new Quality(quality);
    }

    public ItemName getName() {
        return name;
    }

    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    public Quality getQuality() {
        return quality;
    }

    public void setQuality(Quality quality) {
        this.quality = quality;
    }

    @Override
    public String toString() {
        return name.getValue() + ", " + expirationDate.getDays() + ", " + quality.getValue();
    }
}
