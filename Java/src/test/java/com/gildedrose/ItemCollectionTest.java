package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemCollectionTest {

    @Test
    public void testUpdateAll() {
        Item[] items = new Item[]{
                new Item("Aged Brie", 5, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20)
        };
        ItemCollection itemCollection = new ItemCollection(items);
        itemCollection.updateAll();
        assertEquals(11, items[0].getQuality().getValue());
        assertEquals(22, items[1].getQuality().getValue()); 
    }
}
