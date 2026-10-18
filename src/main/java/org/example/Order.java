package org.example;

import java.time.LocalDateTime;

public class Order {
    private LocalDateTime date;
    private String name;
    private int amount;

    public Order(LocalDateTime date, String name, int amount) {
        this.date = date;
        this.name = name;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return date + " --- " + name + " --- " + amount;
    }
}
