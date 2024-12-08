package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GildedRoseTest {

    @Test
    public void testUpdateInventory() {
        Item[] items = new Item[]{
                new Item("Aged Brie", 5, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
        };
        GildedRose gildedRose = new GildedRose(items);
        gildedRose.updateInventory();
        assertEquals(11, items[0].getQuality().getValue());
        assertEquals(22, items[1].getQuality().getValue());
        assertEquals(80, items[2].getQuality().getValue());
    }
}
