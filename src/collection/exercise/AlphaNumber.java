package collection.exercise;

import javax.swing.text.html.parser.Entity;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AlphaNumber {
    public static void main(String[] args) {
//        获取一个字符串的字母出现的次数：
        String string = "sdfgesdgsdxjahskjsaxkskfdsfcbxbbfhj";
        printResult1(string);
    }

    public static void printResult1(String string) {
        char[] chars = string.toCharArray();

        Map <Character, Integer> result = new TreeMap <>();
        for (char c : chars) {
            Integer i = result.get(c);

            if (null == i)
                result.put(c, 1);
            else
                result.put(c, i + 1);

        }

        System.out.println(result);
        printResult(result);
    }

    private static void printResult(Map map) {
        if (null == map) {
            System.out.println("fuck null");
        }

        Map <Character, Integer> result = (TreeMap) map;

        Set <Map.Entry <Character, Integer>> entrySet = result.entrySet();
//        for (Map.Entry entry : entrySet) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

        Iterator <Map.Entry <Character, Integer>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character,Integer> entry = iterator.next();
            System.out.println(entry.getKey() + "  "+ entry.getValue());
        }



    }

}
