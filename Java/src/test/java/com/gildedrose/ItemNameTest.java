package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ItemNameTest {

    @Test
    public void testEquals() {
        ItemName itemName1 = new ItemName("Aged Brie");
        ItemName itemName2 = new ItemName("Aged Brie");
        ItemName itemName3 = new ItemName("Sulfuras, Hand of Ragnaros");

        assertTrue(itemName1.equals("Aged Brie"));
        assertFalse(itemName1.equals("Sulfuras, Hand of Ragnaros"));
    }
}
