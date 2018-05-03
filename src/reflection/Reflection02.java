package reflection;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Reflection02 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String fieldName = "title";
        String titleValue = "fuck java";

        Class <?> cls = Book.class;
        Object obj = cls.newInstance();
        Method setMethod = cls.getMethod("set" + initcap(fieldName), String.class);
        Method getMethod = cls.getMethod("get" + initcap(fieldName), String.class);

        setMethod.invoke(obj, titleValue);
        System.out.println(getMethod.invoke(obj));

    }

    public static String initcap(String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
