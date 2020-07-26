package Mate;
import java.util.Stack;
public class Vaild {
    public boolean isvaild(String s){
        Stack<Character> stack = new Stack<>();
        for (int i = 0;i<s.length();i++){
            char ch1 = s.charAt(i);
            if (ch1=='(' || ch1=='[' ||ch1=='{') {
                stack.push(ch1);
            } else {
                if (stack.empty()){
                    System.out.println("右括号多！");
                    return false;
                }
                char ch2 = stack.peek();
                if (ch2=='('&&ch1==')' || ch2=='['&&ch1==']' || ch2=='{'&&ch1=='}'){
                    stack.pop();
                } else {
                    System.out.println("左右括号不匹配！");
                    return false;
                }

            }
        }
        if (!stack.empty()){
            System.out.println("左括号多！");
            return false;
        }
        return true;
    }
}
