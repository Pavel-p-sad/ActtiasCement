package org.example.reader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileNoTxtReader {
    private final String fileNameWay;

    public FileNoTxtReader(String fileNameWay) {
        this.fileNameWay = fileNameWay;
    }

    public List<String> readFileNoTxt() throws IOException{
        return Files.readAllLines(Path.of(fileNameWay));

    }
}