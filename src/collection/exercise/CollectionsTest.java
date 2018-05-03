package collection.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
        List <String> stringList = new ArrayList <>();
        stringList.add("eee");
        stringList.add("ddd");
        stringList.add("ccc");
        stringList.add("bbb");
        stringList.add("aaa");
        stringList.add("fff");

        print(stringList);

        Collections.sort(stringList);
        print(stringList);

        System.out.println(Collections.max(stringList));

        Collections.shuffle(stringList);
        print(stringList);
    }

    public static void print(List <String> stringList) {

        for (Iterator it = stringList.iterator(); it.hasNext(); ) {

            System.out.println(it.next());
        }

//        for (String string : stringList) {
//            System.out.println(string);
//        }
//
//        for (int i = 0; i < stringList.size(); i++) {
//            System.out.println(stringList.get(i));
//        }

        System.out.println("\n==============\n");
    }
}
