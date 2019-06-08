package com.pillar.kata;

public class VendingMachine {

    private CoinManager coinManager;
    private boolean itemVended;
    private boolean itemFailedToVend;

    VendingMachine() {
        this.coinManager = new CoinManager();
        this.itemVended = false;
        this.itemFailedToVend = false;
    }

    // TODO simplify message return, try to avoid extra state
    public String getDisplay() {
        if (itemVended) {
            itemVended = false;
            return "THANK YOU";
        }
        if (itemFailedToVend) {
            itemFailedToVend = false;
            return "PRICE 1.00";
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
        if (coinManager.getValue() >= 100) {
            itemVended = true;
            coinManager = new CoinManager();
        } else {
            itemFailedToVend = true;
        }
    }
}
