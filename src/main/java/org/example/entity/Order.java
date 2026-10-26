package org.example.entity;
import java.math.BigDecimal;
import java.time.LocalDateTime;
public class Order {
    private final LocalDateTime date;
    private final String name;
    private final BigDecimal amount;

    public Order(LocalDateTime date, String name, BigDecimal amount) {
        this.date = date;
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return date + " --- " + name + " --- " + amount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getName() {
        return name;
    }
}