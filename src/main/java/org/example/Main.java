package org.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        FileTxtReader reader1 = new FileTxtReader("src/main/resources/discount_day (1).txt");
        //FileNoTxtReader reader2 = new FileNoTxtReader("src/main/resources/discount_day_without_ext (1)");
        TxtFileAdapter adapter1 = new TxtFileAdapter(reader1);
        //NoTxtFileAdapter adapter2 = new NoTxtFileAdapter(reader2);
        List<OrderSource> sources = List.of(adapter1);//, adapter2
        List<Order> allOrders = new ArrayList<>();
        for (OrderSource sq : sources) {
            allOrders.addAll(sq.read());
        }
        allOrders.sort(Comparator.comparing(Order::getDate));
        PriseCalculate price = new PriseCalculate(0.6, 0.07, 500.0);
        List<OrderAfterBye> allOrdersAfterPrice = new ArrayList<>();
        for (Order order : allOrders){
            allOrdersAfterPrice.add(
                new OrderAfterBye(
                    order, price.calcPrice(
                        order.getAmount()
                    )
                )
            );
        }
        Map<String, Double> itog = (SummOrderCompany.getIterOrders (allOrdersAfterPrice));
        FileResultWriter writer = new FileResultWriter(itog);
        writer.fileWriteMap();
    }
}
