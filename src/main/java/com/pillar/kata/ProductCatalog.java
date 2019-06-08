package com.pillar.kata;

public class ProductCatalog {

    public int getPrice(String name) {
        if (name.equals("COLA")) {
            return 100;
        }
        return 0;
    }

    public void add(String name, int price) {

    }
}
