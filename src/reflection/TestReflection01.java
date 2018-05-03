package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class Book{
    private String name;

    public Book(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class TestReflection01 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
//        Class <?> cls = Book.class;
        Class <?> cls = Class.forName("reflection.Book");
        System.out.println(cls);
        Constructor <?> con = cls.getConstructor(String.class);
        Book book = (Book) con.newInstance("java");
//        book.setName("java2");
        System.out.println(book);
    }
}
