package AdapterPattern;

public class FileWriter implements Writer {

    private String fileName;

    FileWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void write(byte[] bytes) {
        System.out.println("write to file ： " + fileName);
    }
}
