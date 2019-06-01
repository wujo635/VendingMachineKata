package com.pillar.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachine machine = new VendingMachine();

    @Test
    public void shouldDisplayInsertCoinWithNothingInserted() {
        assertEquals("INSERT COIN", machine.getDisplay());
    }

    @Test
    public void shouldInitializeEmptyCoinReturn() {
        assertEquals("", machine.getCoinReturn());
    }

    @Test
    public void shouldUpdateTotalGivenAcceptableCoin() {
        machine.insert("QUARTER");
        assertEquals("0.25", machine.getDisplay());
    }

    @Test
    public void shouldNotUpdateTotalOnUnacceptedInsert() {
        machine.insert("BUTTON");
        assertEquals("INSERT COIN", machine.getDisplay());
    }

    @Test
    public void shouldReturnUnacceptedInsert() {
        machine.insert("PENNY");
        assertEquals("PENNY", machine.getCoinReturn());
    }

    @Test
    public void shouldDisplayThankYouWhenProductDispensed() {
        machine.select("COLA");
        assertEquals("THANK YOU", machine.getDisplay());
    }

}
