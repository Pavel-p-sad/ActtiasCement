package org.example;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class TxtFileAdapter implements  OrderSource {
    private final FileTxtReader reader;

    public TxtFileAdapter(FileTxtReader reader) {
        this.reader = reader;
    }

    @Override
    public List<Order> read () throws IOException{
        List<Order> orders = new ArrayList<Order>();
        List<String> a = reader.readFile();
        for (String s : a) {
            String[] datas = s.split("\\|");
            LocalDateTime date = LocalDateTime.parse(datas[0]);
            String name =  datas[1];
            int amount = Integer.parseInt(datas[2]);
            orders.add(new Order(date, name, amount));
        }
        return orders;
    }
}
