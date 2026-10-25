package org.example.service;
import org.example.entity.OrderAfterBye;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummOrderCompany {

    public static Map<String, BigDecimal> getIterOrders (List<OrderAfterBye> allOrdersAfterPrice) {
        Map<String, BigDecimal> map = new HashMap<>();
        for (OrderAfterBye o : allOrdersAfterPrice) {
            String company = o.getOrder().getName();
            BigDecimal price = o.getPrise();
            map.merge(company, price, (a, b) -> a.add(b));
        }
        return map;
    }
}