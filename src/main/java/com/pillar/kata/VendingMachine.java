package com.pillar.kata;

public class VendingMachine {

    private int amountInserted;

    VendingMachine() {
        this.amountInserted = 0;
    }

    public String getDisplay() {
        if (amountInserted > 0) {
            return "0.05";
        }
        return "INSERT COIN";
    }

    public void insert(String coin) {
        amountInserted += 5;
    }
}
