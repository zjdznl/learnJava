package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class RemoveListTest {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Effective Java";
        Book book2 = new Book();
        book2.name = "Effective Java";
        Book book3 = new Book();
        book3.name = "Effective Java 1";
        List <Book> list = new ArrayList <Book>();
        list.add(book1);
//        list.add(book2);
//        list.add(book3);
        list.remove(book3);
        System.out.println(list.size());
        list.remove(book2);
        System.out.println(list.size());



        //三种迭代方式 索引效率最高 迭代器最差
        Iterator <Book> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        for (Book book : list) {
            System.out.println(book);
        }

        for (int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }


    }
}
