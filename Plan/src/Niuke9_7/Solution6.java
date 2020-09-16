package Niuke9_7;

import java.util.Stack;

public class Solution6 {
    /**
     *
     * @param s string字符串
     * @return bool布尔型
     */
    public boolean isValid (String s) {
        // write code here
        //将字符串转换为数组
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        /*stack.add(chars[0]);
        // 遍历数组
        for(int i = 1;i<s.length();i++){
            stack.add(chars[i]);
            if(chars[i] == '{' ||chars[i] == '[' ||chars[i] == '('){
                stack.add(chars[i]);
            } else if(!stack.empty()){
                char ch = stack.peek();
                if(ch=='{' && chars[i]=='}' ||ch=='(' && chars[i]==')'||ch=='[' && chars[i]==']' ){
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        } else {
            return false;
        }*/



        for(int i = 0;i<s.length();i++){
            // 遍历数组放入栈中
            stack.push(chars[i]);
            //判断如果是右括号，进行出栈，在判断下一个是否与之匹配
            if(chars[i] == '}' ||chars[i] == ']' ||chars[i] == ')'){
                stack.pop();
                if (!stack.empty()){
                    char ch = stack.peek();
                    //判断是否匹配
                    if ((ch == '{' && chars[i] == '}') || (ch == '(' && chars[i] == ')' )|| (ch == '[' && chars[i] == ']')){
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            }
        }
        if(stack.empty()){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution6 t = new Solution6();
        String str = "[";
        System.out.println(t.isValid(str));
    }
}