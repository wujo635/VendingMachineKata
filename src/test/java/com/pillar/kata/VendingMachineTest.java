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
    public void shouldAcceptNickel() {
        machine.insert("NICKEL");
        assertEquals("0.05", machine.getDisplay());
    }

    @Test
    public void shouldAcceptDime() {
        machine.insert("DIME");
        assertEquals("0.10", machine.getDisplay());
    }

    @Test
    public void shouldAcceptQuarter() {
        machine.insert("QUARTER");
        assertEquals("0.25", machine.getDisplay());
    }
}
