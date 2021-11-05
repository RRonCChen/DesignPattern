package AdapterPattern;

public class main {

    public static void main(String[] args) {
        String fileName = "test.txt";
        Exporter writerAdapter = new WriterAdapter(new FileWriter(fileName));
        writerAdapter.export("測試內容");
    }
}
