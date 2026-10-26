package org.example.service;

import org.example.adapter.TxtFileAdapter;
import org.example.entity.Order;
import org.example.reader.FileTxtReader;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class TxtFileAdapterTest {

    @Test
    void parsesValidLine() throws Exception {
        FileTxtReader ftr = new FileTxtReader("src/test/resources/test_orders.txt");
        TxtFileAdapter adapter = new TxtFileAdapter(ftr);
        List<Order> orders = adapter.read();

        assertEquals(1, orders.size());
        Order order = orders.get(0);

        assertEquals("Industrial", order.getName());
        assertEquals(0, new BigDecimal("100").compareTo(order.getAmount()));
        assertEquals(LocalDateTime.parse("2021-02-09T16:00:22"), order.getDate());
    }

    @Test
    void throwsExceptionForBrokenLine() throws Exception {
        FileTxtReader ftr = new FileTxtReader("src/test/resources/broken_orders.txt");
        TxtFileAdapter adapter = new TxtFileAdapter(ftr);

        assertThrows(IllegalArgumentException.class, () -> adapter.read());
    }
}