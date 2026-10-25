package org.example.service;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileResultWriter {
    Map<String, BigDecimal> map;

    public FileResultWriter(Map<String, BigDecimal> map) {
        this.map = map;
    }

    public void fileWriteMap() {
        List<String> Itog =  new ArrayList<>();
        for (Map.Entry<String, BigDecimal> e : map.entrySet()) {
            String company = e.getKey();
            BigDecimal summ = e.getValue();
            Itog.add(company + " -- " + summ);
        }
        try {
            Files.write(Path.of("src/main/resources/result.txt"), Itog);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}