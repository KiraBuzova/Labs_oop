package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class InventoryItemTest {

    @Test
    public void testCreateInventoryItemAgedBrie() {
        Item item = new Item("Aged Brie", 5, 10);
        InventoryItem inventoryItem = InventoryItem.create(item);
        assertInstanceOf(AgedBrie.class, inventoryItem);
    }

    @Test
    public void testCreateInventoryItemBackstagePasses() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        InventoryItem inventoryItem = InventoryItem.create(item);
        assertInstanceOf(BackstagePasses.class, inventoryItem);
    }

    @Test
    public void testCreateInventoryItemSulfuras() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        InventoryItem inventoryItem = InventoryItem.create(item);
        assertInstanceOf(Sulfuras.class, inventoryItem);
    }
}
