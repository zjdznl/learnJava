package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        int i1 = 1, i2 = 2;
        Map <String, Integer> map = new HashMap <String, Integer>();
        map.put("first", 1);
        map.put("second", i2);

        System.out.println(map.containsKey("first"));//true new String("first") 也是true StringBuffer、Build false
        System.out.println(map.containsValue(i1));//true
        System.out.println(map.containsValue(1));//true

        Set <String> keySet = map.keySet();

        for (String key : keySet) {
            System.out.println(key + " " + map.get(key));
        }

        map.remove("first");
        System.out.println(map);

    }


}
