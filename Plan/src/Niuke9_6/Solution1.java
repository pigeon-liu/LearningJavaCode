package Niuke9_6;

public class Solution1 {
    /**
     * 汇编语言中有一种移位指令叫做循环左移（ROL），用字符串模拟这个指令的运算结果。
     * 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
     * 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
     * @param str
     * @param n
     * @return
     */
    public String LeftRotateString(String str,int n) {
        if(n==0 || str.length() == 0){
            return str;
        }
        char[] chars = str.toCharArray();
        StringBuffer cur = new StringBuffer();
        for(int i = n;i<str.length();i++){
            cur = cur.append(chars[i]);
        }
        for(int i = 0;i<n;i++){;
            cur = cur.append(chars[i]);
        }
        String string = new String(cur);
        return string;
    }

    public static void main(String[] args) {
        Solution1 t = new Solution1();
        String str = "abcdefg";
        int n =2;
        System.out.println(t.LeftRotateString(str, n));
    }
}