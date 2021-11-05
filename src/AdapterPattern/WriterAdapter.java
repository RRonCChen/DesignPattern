package AdapterPattern;

public class WriterAdapter implements Exporter {

    private Writer writer;

    WriterAdapter(Writer writer) {
        this.writer = writer;
    }

    @Override
    public void export(String content) {
        writer.write(content.getBytes());
    }
}
