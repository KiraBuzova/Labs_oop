package com.gildedrose;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemCollection {
    private final List<Item> items;

    public ItemCollection(Item[] items) {
        this.items = new ArrayList<>();
        Collections.addAll(this.items, items);
    }

    public void updateAll() {
        for (Item item : items) {
            InventoryItem.create(item).dailyUpdate();
        }
    }

}
