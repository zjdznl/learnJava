package collection.set;

import java.util.*;

public class EqualTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.age = 20;
        p2.age = 30;

        Comparator <Person> comparator = new Comparator <Person>() {
            @Override
            public int compare(Person person, Person t1) {
                if (person.age < t1.age)
                    return 1;
                else if(person.age > t1.age)
                    return -1;
                else
                    return 0;
            }
        };

        TreeSet<Person> set = new TreeSet <Person>(comparator);
        set.add(p1);
        set.add(p2);


        System.out.println(set);




//        System.out.println(p1 == p2);
//        System.out.println(p1.equals(p2));
//
//        System.out.println(p1.age);
//        System.out.println(p1.height);
    }
}
