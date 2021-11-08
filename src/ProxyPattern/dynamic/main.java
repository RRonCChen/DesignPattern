package ProxyPattern.dynamic;

public class main {
    public static void main(String[] args) {
        Subject subjectImpl = new SubjectImpl();
        Subject proxy = (Subject) ProxyInvocationHandler.newInstance(subjectImpl);
        proxy.doSome();
    }
}
