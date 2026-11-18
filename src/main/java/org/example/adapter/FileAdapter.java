package org.example.adapter;
import org.example.entity.Order;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public abstract class FileAdapter implements OrderSource {
    protected final String separator;
    protected final List<String> lines;

    protected FileAdapter(String separator, List<String> lines) {
        this.separator = separator;
        this.lines = lines;
    }

    @Override
    public List<Order> read () throws IOException {
        List<Order> orders = new ArrayList<>();
        for (String s : lines) {
            String[] dates = s.split(separator);
            if (dates.length == 3) {
                LocalDateTime date = LocalDateTime.parse(dates[0]);
                String name = dates[1];
                BigDecimal amount = new BigDecimal(dates[2]);
                orders.add(new Order(date, name, amount));
            } else {
                throw new IllegalArgumentException(s);
            }
        }
        return orders;
    }
}