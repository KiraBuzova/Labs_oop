package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SulfurasTest {

    @Test
    void testSulfurasUpdateQuality() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        Sulfuras sulfuras = new Sulfuras(item);

        int initialQuality = item.getQuality().getValue();
        sulfuras.updateQuality();

        assertEquals(initialQuality, item.getQuality().getValue());
    }

    @Test
    void testSulfurasExpiration() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        Sulfuras sulfuras = new Sulfuras(item);

        int initialExpiration = item.getExpirationDate().getDays();
        sulfuras.updateExpiration();

        assertEquals(initialExpiration, item.getExpirationDate().getDays());
    }
}
