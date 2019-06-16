package com.pillar.kata;

import java.util.HashMap;
import java.util.Map;

public class CoinManager {

    private static Map<String, Integer> coinValueMap;
    private int totalCents;
    private String coinReturn;

    static {
        coinValueMap = new HashMap<>();
        coinValueMap.put("NICKEL", 5);
        coinValueMap.put("DIME", 10);
        coinValueMap.put("QUARTER", 25);
    }

    CoinManager() {
        this.totalCents = 0;
        this.coinReturn = "";
    }

    protected void insert(String coin) {
        if (coinValueMap.containsKey(coin)) {
            totalCents += coinValueMap.get(coin);
        } else {
            addToCoinReturn(coin);
        }
    }

    private void addToCoinReturn(String coin) {
        if (!coinReturn.equals("")) {
            coinReturn += ", ";
        }
        coinReturn += coin;
    }

    protected int getValue() {
        return this.totalCents;
    }

    protected String getCoinReturn() {
        return this.coinReturn;
    }

    protected void makeChange(int itemPrice) {
        int changeToReturn = totalCents - itemPrice;
        nextCoinChange(changeToReturn);
    }

    private void nextCoinChange(int changeToReturn) {
        if (changeToReturn > 0) {
            String coin;
            if (changeToReturn >= coinValueMap.get("QUARTER")) {
                coin = "QUARTER";
            } else if (changeToReturn >= coinValueMap.get("DIME")) {
                coin = "DIME";
            } else {
                coin = "NICKEL";
            }
            addToCoinReturn(coin);
            changeToReturn -= coinValueMap.get(coin);
            nextCoinChange(changeToReturn);
        }
    }
}
