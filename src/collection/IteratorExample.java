package collection;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
//        Collection <Integer> numbers = new ArrayList <>();
//
//        for (int i = 0; i < 10; i++) {
//            numbers.add(i);
//        }
//
//
//        Iterator <Integer> iterator = numbers.iterator();
//
//        while (iterator.hasNext()) {
//            int i = iterator.next();
//            System.out.println(i);
//            i = -1;
//            System.out.println("修改后 ： " + i);
//        }

//        注意：当使用Iterator对集合元素进行迭代时，Iterator并不是把集合元素本身传给了迭代变量，而是把集合元素的值传给了迭代变量（就如同参数传递是值传递，基本数据类型传递的是值，引用类型传递的仅仅是对象的引用变量），所以修改迭代变量的值对集合元素本身没有任何影响。
//        System.out.println(numbers);

        Deque <String> deque = new ArrayDeque <>();
        deque.offer("a");
        deque.offer("b");
        deque.offer("c");
        deque.offer("d");

        System.out.println(deque.element());
        System.out.println(deque);
        deque.add("e");
        System.out.println(deque);
        System.out.println(deque.peek());
        System.out.println(deque);
        System.out.println(deque.poll());
        System.out.println(deque);
        System.out.println(deque.remove());
        System.out.println(deque);



    }
}
