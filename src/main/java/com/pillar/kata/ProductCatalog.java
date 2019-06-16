package com.pillar.kata;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Integer> itemPriceMap;

    ProductCatalog() {
        itemPriceMap = new HashMap<>();
    }

    protected int getPrice(String name) {
        if (itemPriceMap.containsKey(name)) {
            return itemPriceMap.get(name);
        }
        return 0;
    }

    protected void add(String name, int price) {
        itemPriceMap.put(name, price);
    }
}
