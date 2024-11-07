package com.gildedrose;

public class InventoryItem {
    protected Item item;

    public static InventoryItem create(Item item) {
        ItemName itemName = item.getName();

        if (itemName.equals(new ItemName(AgedBrie.NAME))) {
            return new AgedBrie(item);
        }
        if (itemName.equals(new ItemName(BackstagePasses.NAME))) {
            return new BackstagePasses(item);
        }
        if (itemName.equals(new ItemName(Sulfuras.NAME))) {
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
        ExpirationDate expirationDate = item.getExpirationDate();
        expirationDate.decrease();
    }

    protected boolean isExpired() {
        ExpirationDate expirationDate = item.getExpirationDate();
        return expirationDate.isExpired();
    }

    protected void processExpired() {
        decreaseQuality();
    }

    protected void increaseQuality() {
        Quality quality = item.getQuality();
        quality.increase();
    }

    protected void decreaseQuality() {
        Quality quality = item.getQuality();
        quality.decrease();
    }
}
