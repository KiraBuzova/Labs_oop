package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QualityTest {

    @Test
    public void testIncreaseQuality() {
        Item item = new Item("Aged Brie", 5, 10);
        Quality quality = item.getQuality();
        quality.increase();
        assertEquals(11, quality.getValue()); // Quality should increase
    }

    @Test
    public void testDecreaseQuality() {
        Item item = new Item("Aged Brie", 5, 10);
        Quality quality = item.getQuality();
        quality.decrease();
        assertEquals(9, quality.getValue()); // Quality should decrease
    }
}
