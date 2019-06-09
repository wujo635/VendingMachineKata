package com.pillar.kata;

import java.util.Queue;

public class VendingMachine {

    private CoinManager coinManager;
    private ProductCatalog catalog;
    private String intermediateMessage;

    VendingMachine() {
        this.coinManager = new CoinManager();
        this.catalog = new ProductCatalog();
        this.intermediateMessage = "";
    }

    // TODO simplify message return, try to avoid extra state
    public String getDisplay() {
        if (!intermediateMessage.equals("")) {
            String temp = intermediateMessage;
            intermediateMessage = "";
            return temp;
        }
        if (coinManager.getValue() > 0) {
            return String.format("%.2f", coinManager.getValue() / 100.0);
        }
        return "INSERT COIN";
    }

    public void insert(String coin) {
        coinManager.insert(coin);
    }

    public String getCoinReturn() {
        return coinManager.getCoinReturn();
    }

    public void select(String item) {
        int itemPrice = catalog.getPrice(item);
        if (itemPrice > 0 && coinManager.getValue() >= itemPrice) {
            intermediateMessage = "THANK YOU";
            coinManager = new CoinManager();
        } else {
            intermediateMessage = "PRICE " + String.format("%.2f", itemPrice / 100.0);
        }
    }
}
