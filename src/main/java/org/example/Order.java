package org.example;
import java.time.LocalDateTime;
public class Order {
    private final LocalDateTime date;
    private final String name;
    private final int amount;
    public Order(LocalDateTime date, String name, int amount) {
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
    public int getAmount() {
        return amount;
    }
    public String getName() {
        return name;
    }
}
