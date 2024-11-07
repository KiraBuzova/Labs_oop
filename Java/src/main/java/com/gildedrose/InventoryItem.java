package com.gildedrose;

public class InventoryItem {
    protected Item item;

    public static InventoryItem create(Item item) {
        if (item.name.equals(AgedBrie.NAME))  {
            return new AgedBrie(item);
        }
        if (item.name.equals(BackstagePasses.NAME))  {
            return new BackstagePasses(item);
        }
        if (item.name.equals(Sulfuras.NAME))  {
            return new Sulfuras(item);
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
        decreaseQuality();
    }

    protected void updateExpiration() {
        item.expirationDate.decrease();
    }

    protected boolean isExpired() {
        return item.expirationDate.isExpired();
    }

    protected void processExpired() {
        decreaseQuality();
    }

    protected void increaseQuality() {
        item.quality.increase();
    }

    protected void decreaseQuality() {
        item.quality.decrease();
    }
}
