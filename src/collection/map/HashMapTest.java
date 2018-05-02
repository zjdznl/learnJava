package collection.map;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args){
        HashMap map = new HashMap();
        map.put(new A(1000), "集合Set");
        map.put(new A(2000), "集合List");
        map.put(new A(3000), new B(1000));
        //仅仅equals()比较为true，但认为是相同的value
        boolean isContainValue = map.containsValue(new B(1000));
        System.out.println(isContainValue);
        //虽然是不同的对象，但是equals()和hashCode()返回结果都相等
        boolean isContainKey = map.containsKey(new A(1000));
        System.out.println(isContainKey);
        //equals()和hashCode()返回结果不满足key相等的条件
        System.out.println(map.containsKey(new A(4000)));
    }

}

