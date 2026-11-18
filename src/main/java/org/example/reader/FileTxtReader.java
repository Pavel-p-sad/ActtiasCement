package org.example.reader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileTxtReader {
    private final String fileNameWay;

    public FileTxtReader(String fileNameWay) {
        this.fileNameWay = fileNameWay;
    }

    public List<String> readFile() throws IOException{
        return Files.readAllLines(Path.of(fileNameWay));

    }
}