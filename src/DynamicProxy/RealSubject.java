package DynamicProxy;

public class RealSubject implements Subject {
    @Override
    public void play() {
        System.out.println("i am play");
    }

    @Override
    public void sayHello(String string) {
        System.out.println("Hello :" + string);
    }

}