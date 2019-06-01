package com.pillar.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinManagerTest {

    private CoinManager coinManager = new CoinManager();

    @Test
    public void shouldInitializeAmountToZero() {
        assertEquals(0, coinManager.getValue());
    }

    @Test
    public void shouldAcceptNickel() {
        coinManager.insert("NICKEL");
        assertEquals(5, coinManager.getValue());
    }

    @Test
    public void shouldAcceptDime() {
        coinManager.insert("DIME");
        assertEquals(10, coinManager.getValue());
    }

    @Test
    public void shouldAcceptQuarter() {
        coinManager.insert("QUARTER");
        assertEquals(25, coinManager.getValue());
    }

    @Test
    public void shouldNotUpdateValueWithUnacceptedCoin() {
        coinManager.insert("PENNY");
        assertEquals(0, coinManager.getValue());
    }

    @Test
    public void shouldReturnUnacceptedCoin() {
        coinManager.insert("PENNY");
        assertEquals("PENNY", coinManager.getCoinReturn());
    }

    @Test
    public void shouldAllowReturnMultipleUnacceptedCoins() {
        coinManager.insert("PENNY");
        coinManager.insert("SILVER DOLLAR");
        assertEquals("PENNY, SILVER DOLLAR", coinManager.getCoinReturn());
    }
}
