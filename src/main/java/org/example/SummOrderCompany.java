package org.example;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummOrderCompany {

    public static Map<String, Double> getIterOrders (List<OrderAfterBye> allOrdersAfterPrice) {
        Map<String, Double> map = new HashMap<>();
        for (OrderAfterBye o : allOrdersAfterPrice) {
            String company = o.getOrder().getName();
            Double price = o.getPrise();
            map.merge(company, price, (a, b) -> a + b);
        }
        return map;
    }
}

