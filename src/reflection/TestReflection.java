package reflection;

import java.util.Date;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException {
        Date date = new Date();
//        Class<?> cls = date.getClass();
//        Class<?> cls = java.util.Date.class;
        Class <?> cls = Class.forName("java.util.Date");
        System.out.println(cls);
    }
}
