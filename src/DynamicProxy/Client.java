package DynamicProxy;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Subject realSubject = new RealSubject();

//        InvocationHandler handler = new DynamicProxy.DynamicProxy(realSubject);
//        DynamicProxy.Subject subject = (DynamicProxy.Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), handler);

        Subject subject = (Subject) new DynamicProxy().bind(realSubject);

        System.out.println("是否是动态代理类: " + Proxy.isProxyClass(DynamicProxy.class));//false ???
        subject.sayHello("fuck jav");
    }
}