package collection.set;

import java.util.Collections;

public class Person implements Comparable {
    public int age;
    public int height;

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;

        if (age != other.age)
            return false;
        if (height != other.height)
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "[age: " + age + ", height: " + height + "]";
    }


    @Override
    public int compareTo(Object o) {
        if (null == o)
            return 1;

        Person newPerson = (Person) o;
        if (age>newPerson.age)
            return 1;
        else if (age == newPerson.age)
            return 0;
        else
            return -1;
    }
}
