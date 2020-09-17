package Niuke9_17;

import java.util.*;


public class Solution2 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param s string字符串
     * @return int整型
     */
    public int minInsertions (String s) {
        // write code here
        if(s == null){
            return 0;
        }
        char[] chars = s.toCharArray();
        int count = 0;   //右括号
        int ret = 0;   //左括号
        Stack<Character> stack = new Stack<>();
        for(int i = chars.length-1; i > 0; --i){
            //如果是左括号，入栈。否则计算右括号个数
            if(chars[i] == ')'){
                stack.push(chars[i]);
                ret++;
            }
            if (chars[i] == '('){
                int flg = 2;
                while (!stack.empty() && stack.peek() == ')' && flg > 0){
                    stack.pop();
                    --flg;
                }
                if (flg != 0){
                    count = count +flg;
                }
            }
        }
        if (!stack.empty()){
            if (stack.size() % 2 == 0){
                count = count + stack.size()/2;
            } else {
                count++;
                count = count + stack.size()/2;
            }
        }
        return count;
    }


    public int movingCount (int m, int n, int k) {
        // write code here
        if(k == 0){
            return 1;
        }
        int count = 0;

        for(int i = 0; i < m; i++){

            for(int j = 0;j < n; j++){
                int sum = 0;
                int a = i;
                int b = j;
                while (a > 0){
                    int num1 = a % 10;
                    sum = sum + num1;
                    a = a/10;
                }
                while (b > 0){
                    int num2 = b % 10;
                    sum = sum + num2;
                    b = b/10;
                }
                if (sum <= k){
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Solution2 t = new Solution2();
        String s = ")()())";
        System.out.println(t.minInsertions(s));
        /*int a = 2;
        int b = 2;
        int c = 2;
        System.out.println(t.movingCount(a, b, c));*/
    }
}