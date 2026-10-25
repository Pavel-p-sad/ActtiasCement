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
    private final String DECORATOR;
    private static final String FILE_PATH = "src/main/resources/result.txt";

    public FileResultWriter(Map<String, BigDecimal> map, String DECORATOR) {
        this.map = map;
        this.DECORATOR = DECORATOR;
    }

    public void fileWriteMap() {
        List<String> Itog =  new ArrayList<>();
        for (Map.Entry<String, BigDecimal> e : map.entrySet()) {
            String company = e.getKey();
            BigDecimal summ = e.getValue();
            Itog.add(company + DECORATOR + summ);
        }
        try {
            Files.write(Path.of(FILE_PATH), Itog);
        }  catch (IOException e) {
            e.printStackTrace();
        }
    }
}