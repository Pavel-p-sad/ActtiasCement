package org.example.service;

import org.example.entity.Order;
import org.example.entity.OrderAfterBye;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SummOrderCompanyTest {

    @Test
    void sumsOrdersSimilarCompany () {
        Order z1 = new Order (LocalDateTime.now(), "Qrecer", new BigDecimal("15"));
        Order z2 = new Order (LocalDateTime.now(),  "Qrecer", new BigDecimal("23"));
        Order z3 = new Order (LocalDateTime.now(),  "Qrecer", new BigDecimal("18"));

        OrderAfterBye pr1 = new OrderAfterBye(z1, new BigDecimal("180"));
        OrderAfterBye pr2 = new OrderAfterBye(z2, new BigDecimal("276"));
        OrderAfterBye pr3 = new OrderAfterBye(z3, new BigDecimal("216"));
        //Заказы после покупки ТИПО с учетом скидки, но я тут не калькулятор тестирую, поэтому обойдемся условными значениями
        Map<String, BigDecimal> result = SummOrderCompany.getIterOrders(List.of(pr1, pr2, pr3));

        assertEquals(0, new BigDecimal("672").compareTo(result.get("Qrecer")));
    }
}
