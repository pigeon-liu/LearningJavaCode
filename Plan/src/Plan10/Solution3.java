package Plan10;
import java.util.*;
public class Solution3{
    /**
     * 一个字符串仅有'R','G','B'三个字符，对他们进行排序，所有的R排在前面，接着G，最后B
     */
    //冒泡排序
    public char[] Bubble  (String str) {
        if (str.length() == 0 || str.equals(" ")) {
            return null;
        }
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length - 1; i++) {
            for (int j = 0; j < ch.length - i - 1; j++) {
                if (ch[j] < ch[j + 1]) {
                    char tmp = ch[j];
                    ch[j] = ch[j + 1];
                    ch[j + 1] = tmp;
                }
            }
        }
        return ch;
    }

    //选择排序
    public char[] select(String str){
        if (str.length() == 0 || str.equals(" ")) {
            return null;
        }
        char[] ch = str.toCharArray();
        for (int i = 0;i<str.length();i++){
            for(int j = i+1; j < str.length();j++){
                if(ch[i] < ch[j]){
                    char tmp = ch[j];
                    ch[j] = ch[i];
                    ch[i] = tmp;
                }
            }
        }
        return ch;
    }

    //使用链表排序
    public ArrayList<ArrayList> func2 (String str){
        if (str.length() == 0 || str.equals(" ")) {
            return null;
        }
        ArrayList<ArrayList> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'R'){
                list1.add(str.charAt(i));
            } else if(str.charAt(i) == 'G'){
                list2.add(str.charAt(i));
            } else if(str.charAt(i) == 'B'){
                list3.add(str.charAt(i));
            }
        }
        list.add(list1);
        list.add(list2);
        list.add(list3);
        return list;
    }

    public static void main(String[] args) {
        Solution3 s = new Solution3();
        String str1 = "RGBRGBBBBGGRR";
        //System.out.println(s.func(str1));
        //System.out.println(s.func2(str1));
        System.out.println(s.select(str1));
    }
}