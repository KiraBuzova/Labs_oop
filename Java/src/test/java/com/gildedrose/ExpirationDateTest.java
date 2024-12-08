package com.gildedrose;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExpirationDateTest {

    @Test
    public void testDecreaseExpiration() {
        Item item = new Item("Aged Brie", 5, 10);
        ExpirationDate expirationDate = item.getExpirationDate();
        expirationDate.decrease();
        assertEquals(4, expirationDate.getDays()); // Expiration should decrease by 1
    }

    @Test
    public void testIsExpired() {
        Item item = new Item("Aged Brie", 0, 10);
        ExpirationDate expirationDate = item.getExpirationDate();
        assertTrue(expirationDate.isExpired()); // Item should be expired when days are 0 or less
    }
}
