package AdapterPattern.adapter;

import AdapterPattern.adapter.Exporter;
import AdapterPattern.writer.Writer;

public class WriterAdapter implements Exporter {

    private Writer writer;

    public WriterAdapter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void export(String content) {
        writer.write(content.getBytes());
    }
}
