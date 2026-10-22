package org.example.entity;

public class OrderAfterBye {
    private final Order order;
    private final Double price;
    public OrderAfterBye(Order order, Double price) {
        this.order = order;
        this.price = price;
    }
    public Double getPrise() {
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
