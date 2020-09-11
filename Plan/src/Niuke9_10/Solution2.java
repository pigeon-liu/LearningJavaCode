package Niuke9_10;

import java.util.ArrayList;

public class Solution2 {
    /**
     * 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
     * 如果没有则返回 -1（需要区分大小写）.（从0开始计数）
     */
    public int FirstNotRepeatingChar(String str) {
        //将字符串转换为数组
        char[] chars = str.toCharArray();
        //遍历数组判断是否有重复数字
        ArrayList<Character> list = new ArrayList<>();
        for(int i = 0;i<str.length();i++){
            //标志数组中第一次出现该字符
            int count = 0;
            // 遍历后面的字符歘，判断是否有重复字符出现
            for(int j = i+1;j<str.length();j++){
                //如果列表中已经包含该字符串，在表示数组中已经有该字符，直接返回
                if (list.contains(chars[i])){
                    count = 1;
                    break;
                }
                // 在遍历后面的字符串，判断是否有重复字符
                if(chars[i] == chars[j]){
                    count = 1;
                    break;
                }
            }
            // 如果count==0则表示该字符中出现过一次
            if(count == 0){
                return i;
            }
            list.add(chars[i]);
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution2 t = new Solution2();
        String str = "liuliugezi";
        System.out.println(t.FirstNotRepeatingChar(str));
    }
}
