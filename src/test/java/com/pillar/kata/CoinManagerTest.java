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
}
