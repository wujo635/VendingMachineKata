package com.pillar.kata;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {

    private int amountInserted;
    private static Map<String, Integer> coinValueMap;

    static {
        coinValueMap = new HashMap<>();
        coinValueMap.put("NICKEL", 5);
        coinValueMap.put("DIME", 10);
        coinValueMap.put("QUARTER", 25);
    }

    VendingMachine() {
        this.amountInserted = 0;
    }

    public String getDisplay() {
        if (amountInserted > 0) {
            return String.format("%.2f", amountInserted / 100.0);
        }
        return "INSERT COIN";
    }

    public void insert(String coin) {
        if (coinValueMap.containsKey(coin)) {
            amountInserted += coinValueMap.get(coin);
        }
    }

    public String getCoinReturn() {
        return "";
    }
}
