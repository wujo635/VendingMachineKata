package com.pillar.kata;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachine machine = new VendingMachine();

    @Test
    public void shouldDisplayInsertCoinWithNothingInserted() {
        assertEquals("INSERT COIN", machine.getDisplay());
    }
}
