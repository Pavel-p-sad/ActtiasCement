package org.example.service;
import java.math.BigDecimal;

public class PriseCalculate {
    private BigDecimal startSale;
    private BigDecimal stepSale;
    private BigDecimal allPrise;
    private BigDecimal sale;

    public PriseCalculate(BigDecimal startSale, BigDecimal stepSale,  BigDecimal allPrise) {
        this.startSale = startSale;
        this.stepSale = stepSale;
        this.allPrise = allPrise;
        this.sale = startSale;
    }
    public BigDecimal calcPrice(BigDecimal amount) {
        if (sale.signum() > 0 && sale.subtract(stepSale).signum() >= 0) {
            BigDecimal result = allPrise.multiply(amount).multiply(BigDecimal.ONE.subtract(sale));
            sale = sale.subtract(stepSale);
            return result;
        } else if (sale.signum() > 0 && sale.subtract(stepSale).signum() < 0) {
            BigDecimal result = allPrise.multiply(amount).multiply(BigDecimal.ONE.subtract(sale));
            sale = BigDecimal.ZERO;
            return result;
        } else {
        return allPrise.multiply(amount);
        }
    }
}