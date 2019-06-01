package com.pillar.kata;

import java.util.HashMap;
import java.util.Map;

public class CoinManager {

    private static Map<String, Integer> coinValueMap;
    private int totalCents;

    static {
        coinValueMap = new HashMap<>();
        coinValueMap.put("NICKEL", 5);
        coinValueMap.put("DIME", 10);
        coinValueMap.put("QUARTER", 25);
    }

    CoinManager() {
        this.totalCents = 0;
    }

    protected void insert(String coin) {
        if (coinValueMap.containsKey(coin)) {
            totalCents += coinValueMap.get(coin);
        }
    }

    protected int getValue() {
        return this.totalCents;
    }

}
