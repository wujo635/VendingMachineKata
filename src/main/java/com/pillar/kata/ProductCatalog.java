package com.pillar.kata;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Integer> itemPriceMap;

    ProductCatalog() {
        itemPriceMap = new HashMap<>();
        itemPriceMap.put("COLA", 100);
        itemPriceMap.put("CHIPS", 50);
        itemPriceMap.put("CANDY", 65);
    }

    public int getPrice(String name) {
        if (itemPriceMap.containsKey(name)) {
            return itemPriceMap.get(name);
        }
        return 0;
    }

    public void add(String name, int price) {
        itemPriceMap.put(name, price);
    }
}
