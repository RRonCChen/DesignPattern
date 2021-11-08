package ProxyPattern;

public class main {
    public static void main(String[] args) {
        SubjectProxy proxy = new SubjectProxy(new SubjectImpl());
        proxy.doSome();
    }
}
