package org.example.adapter;
import org.example.reader.FileTxtReader;
import java.io.IOException;

public class TxtFileAdapter extends FileAdapter {
    private static final String SEPARATOR = "\\|";

    public TxtFileAdapter(FileTxtReader reader) throws IOException {
        super(SEPARATOR, reader.readFile());
    }
}