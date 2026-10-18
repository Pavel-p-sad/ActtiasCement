package org.example;
import java.io.IOException;
import java.util.List;

public interface OrderSource {
    List<Order> read () throws IOException;


}
