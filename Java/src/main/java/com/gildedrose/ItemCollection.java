package com.gildedrose;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ItemCollection {
    private final List<Item> items;

    public ItemCollection(Item[] itemsArray) {
        items = new ArrayList<>();
        Collections.addAll(items, itemsArray);
    }

    public void updateAll() {
        for (Item item : items) {
            InventoryItem inventoryItem = InventoryItem.create(item);
            inventoryItem.dailyUpdate();
        }
    }
}
