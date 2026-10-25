package org.example.entity;

import java.math.BigDecimal;

public class OrderAfterBye {
    private final Order order;
    private final BigDecimal price;

    public OrderAfterBye(Order order, BigDecimal price) {
        this.order = order;
        this.price = price;
    }
    public BigDecimal getPrise() {
        return price;
    }
    public Order getOrder() {
        return order;
    }
    @Override
    public String toString() {
        return order.getDate() + " | " + order.getName() + " | " + order.getAmount() + " --- " + price;
    }
}
