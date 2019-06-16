package com.pillar.kata;

import java.util.LinkedList;
import java.util.Queue;

public class VendingMachine {

    private CoinManager coinManager;
    private ProductCatalog catalog;
    private Queue<String> message;

    VendingMachine() {
        this.coinManager = new CoinManager();
        this.catalog = new ProductCatalog();
        this.message = new LinkedList<>();
        catalog.add("COLA", 100);
        catalog.add("CHIPS", 50);
        catalog.add("CANDY", 65);
    }

    public String getDisplay() {
        if (message.peek() != null) {
            return message.remove();
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
            coinManager.makeChange(itemPrice);
            message.add("THANK YOU");
        } else {
            message.add("PRICE " + String.format("%.2f", itemPrice / 100.0));
        }
    }
}
