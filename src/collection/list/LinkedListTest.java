package collection.list;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList <>();
        list.add("1111");
        list.add("2222");
        list.add("3333");
        showList(list);

        list.addFirst("head");
        showList(list);

        Iterator <String> iterator = list.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println(list.element());
        System.out.println(list.getFirst());
        System.out.println(list.peek());
        System.out.println(list.peekFirst());
        System.out.println(list.peekLast());
        System.out.println(list.getLast());


        list.offer("tail");
        showList(list);

        list.offerFirst("-----");
        showList(list);

        list.offerLast("====");
        showList(list);


        System.out.println(list.poll());
        System.out.println(list.pollFirst());
        System.out.println(list.pollLast());

        list.push("xyz");
        showList(list);

        System.out.println(list.pop());
        showList(list);

        System.out.println(list.removeFirst());
        showList(list);

        System.out.println(list.removeFirstOccurrence("3333"));
        showList(list);

        System.out.println(list.removeLast());
        showList(list);


    }

    public static void showList(List list) {
        System.out.println(Arrays.toString(list.toArray()));
    }
}
