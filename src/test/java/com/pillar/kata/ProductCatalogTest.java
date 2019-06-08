package com.pillar.kata;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductCatalogTest {

    private ProductCatalog catalog = new ProductCatalog();

    @Test
    public void shouldAllowAccessToPriceOfProduct() {
        assertEquals(100, catalog.getPrice("COLA"));
    }
}
