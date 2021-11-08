package ProxyPattern;

public class SubjectProxy implements Subject {

    private Subject subject;

    public SubjectProxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void doSome() {
        System.out.println("before call doSome()");
        subject.doSome();
        System.out.println("after call doSome()");
    }
}
