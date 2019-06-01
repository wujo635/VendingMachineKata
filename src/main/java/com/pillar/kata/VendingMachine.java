package com.pillar.kata;

public class VendingMachine {

    private CoinManager coinManager;

    VendingMachine() {
        this.coinManager = new CoinManager();
    }

    public String getDisplay() {
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
}
