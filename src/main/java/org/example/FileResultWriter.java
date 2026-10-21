package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FileResultWriter {
    Map<String, Double> map;
    public FileResultWriter(Map<String, Double> map) {
        this.map = map;
    }

    public void fileWriteMap() {
        List<String> Itog =  new ArrayList<>();
        for (Map.Entry<String, Double> e : map.entrySet()) {
            String company = e.getKey();
            Double summ = e.getValue();
            Itog.add(company + " -- " + summ);
        }
        try {
            Files.write(Path.of("src/main/resources/result.txt"), Itog);
        }  catch (IOException e) {
            e.printStackTrace();
        }

    }

}
