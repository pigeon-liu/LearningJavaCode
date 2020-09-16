package Niuke9_15;

import java.util.ArrayList;
import java.util.Stack;

public class Solution3 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int index = 0;
        for(int i = 0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (!stack.empty() && stack.peek()==popA[index]){
                index++;
                stack.pop();
            }
        }
        return stack.empty();

    }


    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] popA = {4,5,3,2,1};
        System.out.println(IsPopOrder(pushA, popA));
    }
}