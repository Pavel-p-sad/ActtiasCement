package org.example.service;

import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PriseCalculateTest {

    @Test
    void firstOrderGetsStartDiscount() {
        PriseCalculate calc = new PriseCalculate(
            new BigDecimal("0.6"),
            new BigDecimal("0.07"),
            new BigDecimal("12")
        );
        BigDecimal result = calc.calcPrice(new BigDecimal("10"));
        assertEquals(0, new BigDecimal("48").compareTo(result));
    }

    @Test
    void secondOrderGetsStartDiscount() {
        PriseCalculate calc = new PriseCalculate(
            new BigDecimal("0.6"),
            new BigDecimal("0.07"),
            new BigDecimal("12")
        );
        calc.calcPrice(new BigDecimal("10"));
        BigDecimal result = calc.calcPrice(new BigDecimal("10"));
        assertEquals(0, new BigDecimal("56.4").compareTo(result));
    }

    @Test
    void fullPriceWhenDiscountIsZero() {
        PriseCalculate calc = new PriseCalculate(
            new BigDecimal("0.06"),
            new BigDecimal("0.03"),
            new BigDecimal("12")
        );
        calc.calcPrice(new BigDecimal("10"));
        calc.calcPrice(new BigDecimal("10"));
        BigDecimal result = calc.calcPrice(new BigDecimal("10"));
        assertEquals(0, new BigDecimal("120").compareTo(result));
    }
}