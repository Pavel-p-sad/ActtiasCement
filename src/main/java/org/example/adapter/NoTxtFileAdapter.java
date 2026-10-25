package org.example.adapter;
import org.example.reader.FileNoTxtReader;
import java.io.IOException;

public class NoTxtFileAdapter extends FileAdapter{
    public NoTxtFileAdapter(FileNoTxtReader reader) throws IOException {
        super("#", reader.readFileNoTxt());
    }
}
