package student;

import java.util.*;

public class Deletes {
    /*删除第一个字符串当中出现的第二个字符串的字符
    * String str1 = "welcome to bit"
    * String str2 = "come"
    * 输出结果：wl t bit
    */

    public static List<Character> func(String string1, String string2){
        List<Character> list = new ArrayList<>();
        for (int i = 0;i<string1.length();i++){
            char ch = string1.charAt(i);
            if (!string2.contains(ch+"")) {
                list.add(ch);
            }
        }
        return list;

    }
    public static void main(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> ret = func(str1,str2);
        //System.out.println(ret);
        for (char ch:ret) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
