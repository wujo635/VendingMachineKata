package com.pillar.kata;

public class VendingMachine {

    private CoinManager coinManager;
    private boolean itemVended;

    VendingMachine() {
        this.coinManager = new CoinManager();
        this.itemVended = false;
    }

    public String getDisplay() {
        if (coinManager.getValue() > 0) {
            return String.format("%.2f", coinManager.getValue() / 100.0);
        }
        if (itemVended) {
            return "THANK YOU";
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
        this.itemVended = true;
    }
}
