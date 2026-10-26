package org.example.adapter;
import org.example.reader.FileNoTxtReader;
import java.io.IOException;

public class NoTxtFileAdapter extends FileAdapter{
    protected static final String SEPARATOR = "#";

    public NoTxtFileAdapter(FileNoTxtReader reader) throws IOException {
        super(SEPARATOR, reader.readFileNoTxt());
    }
}
