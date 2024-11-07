package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AgedBrieTest {

    @Test
    public void testUpdateQuality() {
        Item item = new Item("Aged Brie", 5, 10);
        AgedBrie agedBrie = new AgedBrie(item);
        agedBrie.updateQuality();
        assertEquals(11, item.getQuality().getValue());
    }

    @Test
    public void testProcessExpired() {
        Item item = new Item("Aged Brie", -1, 10);
        AgedBrie agedBrie = new AgedBrie(item);
        agedBrie.processExpired();
        assertEquals(12, item.getQuality().getValue()); 
    }
}
