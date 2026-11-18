package org.example.service;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileResultWriter {
    private final Map <String, BigDecimal> map;
    private final String DECORATOR;
    private static final String FILE_PATH = "src/main/resources/result.txt";

    public FileResultWriter(Map<String, BigDecimal> map, String DECORATOR) {
        this.map = map;
        this.DECORATOR = DECORATOR;
    }

    public void fileWriteMap() throws  IOException {
        List<String> itog =  new ArrayList<>();
        for (Map.Entry<String, BigDecimal> e : map.entrySet()) {
            String company = e.getKey();
            BigDecimal summ = e.getValue();
            itog.add(company + DECORATOR + summ);
        }
        Files.write(Path.of(FILE_PATH), itog);
    }
}