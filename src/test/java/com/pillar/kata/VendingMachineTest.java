package com.pillar.kata;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    private VendingMachine machine = new VendingMachine();

    private void quickDollarInsert() {
        machine.insert("QUARTER");
        machine.insert("QUARTER");
        machine.insert("QUARTER");
        machine.insert("QUARTER");
    }

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
        this.quickDollarInsert();
        machine.select("COLA");
        assertEquals("THANK YOU", machine.getDisplay());
    }

    @Ignore // test deprecated after Make Change
    @Test
    public void shouldDisplayInsertCoinAfterThankYou() {
        this.quickDollarInsert();
        machine.select("COLA");
        machine.getDisplay();
        assertEquals("INSERT COIN", machine.getDisplay());
    }

    @Test
    public void shouldDisplayPriceWhenNotEnoughMoneyInserted() {
        machine.select("COLA");
        assertEquals("PRICE 1.00", machine.getDisplay());
    }

    @Test
    public void shouldDisplayInsertCoinAfterPriceWhenCoinInserted() {
        machine.select("COLA");
        machine.getDisplay();
        assertEquals("INSERT COIN", machine.getDisplay());
    }

    @Test
    public void shouldAllowChipsToBeSelected() {
        machine.select("CHIPS");
        assertEquals("PRICE 0.50", machine.getDisplay());
    }

    @Test
    public void shouldAllowCandyToBeSelected() {
        machine.select("CANDY");
        assertEquals("PRICE 0.65", machine.getDisplay());
    }

    @Test
    public void shouldAllowChangeInCoinReturnUsingOneTypeOfCoin() {
        quickDollarInsert();
        machine.select("CHIPS");
        assertEquals("QUARTER, QUARTER", machine.getCoinReturn());
    }

    @Test
    public void shouldReturnNoChangeWhenExactPriceIsInserted() {
        quickDollarInsert();
        machine.select("COLA");
        assertEquals("", machine.getCoinReturn());
    }

    @Test
    public void shouldAllowChangeInCoinReturnUsingMultipleTypeOfCoin() {
        quickDollarInsert();
        machine.select("CANDY");
        assertEquals("QUARTER, DIME", machine.getCoinReturn());
    }

    @Test
    public void shouldReturnUnspentCoin() {
        machine.insert("DIME");
        machine.returnCoins();
        assertEquals("DIME", machine.getCoinReturn());
    }
}
