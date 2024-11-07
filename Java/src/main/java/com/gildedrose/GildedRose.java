package com.gildedrose;

class GildedRose {
    private final ItemCollection itemCollection;

    public GildedRose(Item[] items) {
        this.itemCollection = new ItemCollection(items);
    }

    public void updateInventory() {
        itemCollection.updateAll();
    }
}
