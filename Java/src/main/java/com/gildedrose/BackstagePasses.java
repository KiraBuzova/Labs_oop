package com.gildedrose;

public class BackstagePasses extends InventoryItem {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();

        if (item.expirationDate.getDays() < 11) {
            increaseQuality();
        }

        if (item.expirationDate.getDays() < 6) {
            increaseQuality();
        }
    }

    @Override
    protected void processExpired() {
        item.quality = new Quality(0);
    }
}
