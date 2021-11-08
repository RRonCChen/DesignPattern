package AdapterPattern;

import AdapterPattern.adapter.Exporter;
import AdapterPattern.adapter.WriterAdapter;
import AdapterPattern.writer.FileWriter;

public class main {

    public static void main(String[] args) {
        String fileName = "test.txt";
        Exporter writerAdapter = new WriterAdapter(new FileWriter(fileName));
        writerAdapter.export("測試內容");
    }
}
