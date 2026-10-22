package org.example.adapter;
import org.example.reader.FileNoTxtReader;
import org.example.entity.Order;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class NoTxtFileAdapter implements OrderSource {
    private final FileNoTxtReader reader;
    public NoTxtFileAdapter(FileNoTxtReader reader) {
        this.reader = reader;
    }
    @Override
    public List<Order> read () throws IOException {
        List<Order> orders = new ArrayList<Order>();
        List<String> a = reader.readFileNoTxt();
        for (String s : a) {
            String[] dates = s.split("#");
            LocalDateTime date = LocalDateTime.parse(dates[0]);
            String name = dates[1];
            int amount = Integer.parseInt(dates[2]);
            orders.add(new Order(date, name, amount));
        }
        return orders;
    }
}
