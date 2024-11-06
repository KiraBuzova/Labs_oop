package com.gildedrose;

public class InventoryItem {
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    protected Item item;

    public static InventoryItem create(Item item) {
        if (item.name.equals(AGED_BRIE))  {
            return new AgedBrie(item);
        }
        if (item.name.equals(BACKSTAGE_PASSES))  {
            return new BackstagePasses(item);
        }
        return new InventoryItem(item);
    }
    
    public InventoryItem(Item item) {
        this.item = item;
    }

    public void dailyUpdate() {
        updateQuality();
        updateExpiration();
        if (isExpired()) {
            processExpired();
        }
    }

    protected void updateQuality() {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        else decreaseQuality();
    }

    protected void updateExpiration() {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }
        item.sellIn--;
    }

    protected boolean isExpired() {
        return item.sellIn < 0;
    }

    protected void processExpired() {
        if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        } else {
            decreaseQuality();
        }
    }

    protected void increaseQuality() {
        if (item.quality < 50) {
            item.quality = item.quality + 1;
        }
    }

    protected void decreaseQuality() {
        if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
    }
}
