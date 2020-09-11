package Niuke9_11;

import java.net.Socket;

public class Solution2 {
    public int NumberOf1(int n) {
        int count = 0;
        // 如果是负数，将最高位转化为0，负数转化为整数 count+1；
        if(n<0){
            n = n & 0X7FFFFFFF;
            count++;
        }
        while(n!=0){
            if(n%2 != 0){
                count++;
            }
            n = n/2;
        }
        return count;
    }

    public int NumberOf2(int n) {
        int count = 0;
        //将整形数字转化为字符串
        String str = Integer.toBinaryString(n);
        //将字符串转化为数组
        char[] chars = str.toCharArray();
        //遍历数组判断字符是否为1
        for (int i = 0;i<chars.length;i++){
            if (chars[i] =='1'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution2 t = new Solution2();
        System.out.println(t.NumberOf2(7));
    }
}
