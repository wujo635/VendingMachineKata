package com.pillar.kata;

public class VendingMachine {

    private int amountInserted;

    VendingMachine() {
        this.amountInserted = 0;
    }

    public String getDisplay() {
        if (amountInserted > 0) {
            return String.format("%.2f", this.amountInserted / 100.0);
        }
        return "INSERT COIN";
    }

    public void insert(String coin) {
        if (coin.equals("NICKEL")) {
            this.amountInserted += 5;
        } else {
            this.amountInserted += 10;
        }
    }
}
