package org.example.adapter;
import org.example.reader.FileTxtReader;
import java.io.IOException;

public class TxtFileAdapter extends FileAdapter {
    public TxtFileAdapter(FileTxtReader reader) throws IOException {
        super("\\|", reader.readFile());
    }
}