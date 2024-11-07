package com.gildedrose;

public class BackstagePasses extends InventoryItem {
    public static final String NAME = "Backstage passes to a TAFKAL80ETC concert";

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();

        ExpirationDate expirationDate = item.getExpirationDate();
        if (expirationDate.getDays() < 11) {
            increaseQuality();
        }

        if (expirationDate.getDays() < 6) {
            increaseQuality();
        }
    }

    @Override
    protected void processExpired() {
        item.setQuality(new Quality(0));
    }
}
