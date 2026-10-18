package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        FileTxtReader reader1 = new FileTxtReader("src/main/resources/discount_day (1).txt");
        FileNoTxtReader reader2 = new FileNoTxtReader("src/main/resources/discount_day_without_ext (1)");
        TxtFileAdapter adapter1 = new TxtFileAdapter(reader1);
        NoTxtFileAdapter adapter2 = new NoTxtFileAdapter(reader2);

        List<OrderSource> sources = List.of(adapter1, adapter2);
        List<Order> allOrders = new ArrayList<>();
        for (OrderSource sq : sources) {
            allOrders.addAll(sq.read());
        }
        for (Order o : allOrders) {
            System.out.println(o);
        }







    }
}