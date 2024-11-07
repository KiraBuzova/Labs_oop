package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BackstagePassesTest {

    @Test
    public void testUpdateQuality() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20);
        BackstagePasses backstagePasses = new BackstagePasses(item);
        backstagePasses.updateQuality();
        assertEquals(22, item.getQuality().getValue());
    }

    @Test
    public void testProcessExpired() {
        Item item = new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20);
        BackstagePasses backstagePasses = new BackstagePasses(item);
        backstagePasses.processExpired();
        assertEquals(0, item.getQuality().getValue()); 
    }
}
