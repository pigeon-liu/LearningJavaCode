package Demo;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;

public class Handle {
    public static void main(String[] args) {
        //字符串比较
        String s1 = "aleng";
        String s2 = "Aleng";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println("a".compareTo("A"));
        System.out.println("A".compareTo("a"));

        /*字符串查找*/
        //判断一个字符串是否存在
        String string = "xuanaleng";
        System.out.println(string.contains("a"));      //true
        //从开始查找指定字符串的位置
        String str1 = "aleng";
        String str2 = "cheng";
        System.out.println(string.indexOf(str1));        //4
        System.out.println(string.indexOf(str2));        //-1
        //从指定位置开始查找子字符串的位置
        System.out.println(string.indexOf(str1, 3));   //4
        System.out.println(string.indexOf(str1, 5));   //-1
        //从后向前查找子字符串的位置
        System.out.println(string.lastIndexOf(str1));  //4
        //从指定位置由后向前查找
        System.out.println(string.lastIndexOf(str1, 3));   //-1
        System.out.println(string.lastIndexOf(str1, 8));    //4

        System.out.println(string.startsWith("a"));  //false
        System.out.println(string.startsWith("xuan"));  //true

        System.out.println(string.startsWith(str1, 4));   //true

        System.out.println(string.endsWith(str1));   //true
        System.out.println(string.endsWith("cheng"));

        /*字符串替换*/
        //替换所有的指定内容
        //替换首个内容
        String reg = "loveyou";
        System.out.println(reg.replaceAll("o", "i"));
        System.out.println(reg.replaceFirst("o", "i"));

        /* 字符串拆分*/
        //将字符串全部拆分
        //将字符串部分拆分，该数组长度就是limit极限)
        String string1 = "woideiailengiduidu";
        String[] ret1 = string1.split("i");
        System.out.println(Arrays.toString(ret1));
        String[] ret2 = string1.split("i",3);
        System.out.println(Arrays.toString(ret2));

        /*字符串截取*/
        //从指定索引截取到结尾
        String ret3 = string1.substring(7);
        System.out.println(ret3);
        //截取部分内容
        String ret4 = string1.substring(8,12);
        System.out.println(ret4);

        /*其他操作方法*/
        //|去掉左右空格，不包含中间空格
        String string3 = " aleng du du";
        String string4 = " Hello World";
        System.out.println(string3.trim());
        // 字符串转大写
        System.out.println(string3.toUpperCase());
        // 字符串转小写
        System.out.println(string4.toLowerCase());
        // 字符串入池操作
        string4.intern();
        String string5 = " Hello World";
        System.out.println(string4 == string5);
        // 字符串连接，等同于+，不入池
        System.out.println(string3.concat(string4));
        // |取得字符串长度
        System.out.println(string3.length());
        // 判断是否为空字符串，但不是null，而是长度为0
        System.out.println(string3.isEmpty());

        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer.append("world"));
        //使用reverse()方法使字符串反转
        System.out.println(stringBuffer.reverse());
        //删除指定范围字符
        System.out.println(stringBuffer.delete(1,4));
        //插入数据
        System.out.println(stringBuffer.insert(0,"你好哇，"));
    }
}
