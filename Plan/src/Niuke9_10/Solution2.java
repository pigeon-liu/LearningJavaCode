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
            list.add(chars[i]);
            for(int j = i+1;j<str.length();j++){
                if (list.contains(chars[j])){
                    break;
                }
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Solution2 t = new Solution2();
        String str = "liuliugezi";
        System.out.println(t.FirstNotRepeatingChar(str));
    }
}
