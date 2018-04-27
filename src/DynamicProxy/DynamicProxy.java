package DynamicProxy;

import com.sun.tracing.dtrace.ArgsAttributes;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class DynamicProxy implements InvocationHandler {
    private Object subject;

//    public DynamicProxy.DynamicProxy() {
//    }
//
//    public DynamicProxy.DynamicProxy(Object subject) {
//        this.subject = subject;
//    }

    public Object bind(Object subject) {
        this.subject = subject;
        return Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {


        System.out.println(method.getName());
        //something before
        long start = System.currentTimeMillis();
        System.out.println("method " + method.getName());
        method.invoke(subject, objects);
        long end = System.currentTimeMillis();
        System.out.println("time " + (end - start));
        //something after
        return null;

    }
}