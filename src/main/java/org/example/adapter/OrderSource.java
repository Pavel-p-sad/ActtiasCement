package org.example.adapter;
import org.example.entity.Order;
import java.io.IOException;
import java.util.List;

public interface OrderSource {
    List<Order> read () throws IOException;
}