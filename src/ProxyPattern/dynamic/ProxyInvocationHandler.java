package ProxyPattern.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    private Object subjectImpl;

    ProxyInvocationHandler(Object subject) {
        this.subjectImpl = subject;
    }

    public static Object newInstance(Object subjectImpl) {
        return Proxy.newProxyInstance(
                subjectImpl.getClass().getClassLoader(),
                subjectImpl.getClass().getInterfaces(),
                new ProxyInvocationHandler(subjectImpl)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("Before doSome");
        Object doSome = method.invoke(subjectImpl, args);
        System.out.println("After doSome");

        return doSome;
    }
}
