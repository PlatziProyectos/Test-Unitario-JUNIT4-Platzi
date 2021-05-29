package com.whnm.javatest.discounts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PriceCalculatorShould {

    private PriceCalculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new PriceCalculator();
    }

    @Test
    public void totalZeroWhenThereArePrices() {
        assertEquals(0.0, calculator.getTotal(), 0);
    }

    @Test
    public void totalIsTheSumOfPrices() {
        calculator.addPrice(10.0);
        calculator.addPrice(15.5);

        assertEquals(25.5, calculator.getTotal(), 0);
    }

    @Test
    public void applyDiscountToPrices() {
        calculator.addPrice(12.5);
        calculator.addPrice(17.5);
        calculator.setDiscount(50.0);
        assertEquals(15.0, calculator.getTotal(), 0);
    }
}