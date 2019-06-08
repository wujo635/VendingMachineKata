package com.pillar.kata;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {

    private Map<String, Integer> itemPriceMap;

    ProductCatalog() {
        itemPriceMap = new HashMap<>();
    }

    public int getPrice(String name) {
        if (itemPriceMap.containsKey(name)) {
            return itemPriceMap.get(name);
        }
        if (name.equals("COLA")) {
            return 100;
        }
        return 0;
    }

    public void add(String name, int price) {
        itemPriceMap.put(name, price);
    }
}
