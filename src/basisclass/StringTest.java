package basisclass;

public class StringTest {
    public static void main(String[] args) {
        /**
         * https://blog.csdn.net/zhao_yu_lei/article/details/71719504
         */


        String s1 = new String("zjd");
        String s2 = s1.intern();
        String s3 = "zjd";

        System.out.println(s1 == s1.intern());
        System.out.println(s1 + " " + s2);
        System.out.println(s2 == s2.intern());
        System.out.println(s2 == s3);
//        String s1 = new String("kvill");
//        String s2 = s1.intern();
//        String s3 = "kvill";
//
//        System.out.println(s1 == s1.intern());
//        System.out.println(s1.equals(s2));// false
//        System.out.println(s1 + " " + s2);          // kvill kvill
//        System.out.println(s2 == s1.intern());      // true
//        System.out.println(s2 == s3);               // true
//        StringBuffer sb = new StringBuffer("abc");
//        StringBuffer sb1 = sb.append(" fuck");
//        System.out.println(sb + "\n" + sb1);
//        System.out.println(sb.equals(sb1) && sb==sb1);
//
//
//        String s = sb.toString();
//        System.out.println(s);
//        sb = new StringBuffer();
//        System.out.println(sb);


//        String string = "aabcdefghijklmn";
//
//        System.out.println(string.length());
//        System.out.println(string.charAt(0));
//        System.out.println(string.indexOf('a'));
//        System.out.println(string.indexOf('a', 1));
//        System.out.println(string.substring(0, 2));
//        System.out.println(string.startsWith("aa"));
//        System.out.println(string.replace("aa", "bb"));


//        1.获取：
//        1）获取字符串str长度
//        int i = str.length();
//        2)根据位置（index)获取字符
//        char  c = str.charAt(index);
//        3)获取字符在字符串中的位置
//        int i =str.indexOf(char ch);  //获取的是第一次出现的位置
//        int i =str.indexOf(char ch ,int index);  //从位置index后获取ch出现的第一次的位置
//        int  i =str.indexOf(str1) ;// 获取str1 在str 第一次出现的位置
//        int i=str.indexOf(str1, index0);//获取从index位置后str第一次出现的位置
//        int i = str.lastIndexOf(ch或者 str1)  //获取ch或者str1最后出现的位置
//
//        2.判断
//        1)判断是否以指定字符串str1开头、结尾
//        boolean b = str.startWith(str1)  //开头
//        boolean b = str.endsWith(str1) //结尾
//        2)判断是否包含某一子串
//        boolean b = str.contains(str1)
//        3)判断字符串是否有内容
//        boolean b = str.isEmpty();
//        4)忽略大小写判断字符串是否相同
//        boolean b = str.equalsIgnoreCase(str1);
//
//        3.转换
//        1)将字符数组 -char[] ch- 转化成字符串
//        i.  String str =new String(ch); //将整个数组变成字符串
//        ii. String str =new String(ch,offset,count)
//        //将字符数组中的offset位置之后的count个元素转换成字符串
//        1. String str =String.valueOf(ch);
//        2. String str =String.copyValueOf(ch,offset,count);
//        3. String str =String.copyValueOf(ch);
//        2)将字符串转化为字符数组
//        char[] ch = str.toCharAarray();
//        3)将字节数组转换为字符串
//        同上1) 传入类型变为Byte[];
//        4)将字符串转换为字节数组
//        Byte[] b = str.toByteArray();
//        5)将基本数据类型装换成字符串
//        String str = String.valueOf(基本数据类型数据)；
//        若是整形数据可以用 字符串连接符 + ""
//        eg :  String  str = 5+"";
//        得到字符串 “5”
//
//        4.替换   replace();
//        str.replace(oldchar,newchar)//将str里oldchar变为newchar
//        str.replace(str1,str2)//将str中str1，变为str2
//
//        5.切割   split();
//        String[]  str1 = str.split(","); //将str用 ","分割成String数组
//
//        6.子串
//        String s = str.substring(begin);
//        // s 为 str 从begin位置到最后的字符串
//        String s = str.substring(begin,end)
//        //s 是 str 从begin 位置到end 位置的字符串
//
//        7.转换大小写：
//        String s1 = str. toUpperCase(); //将str变成大写字母
//        String s2 = str. toLowerCase(); //将str变成小写字母
//        除去空格：
//        String s =str.trim();
//        比较：
//        int i = str.compareTo(str1);
    }
}
