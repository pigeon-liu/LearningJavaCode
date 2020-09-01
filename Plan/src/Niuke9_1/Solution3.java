package Niuke9_1;

import java.util.Stack;

public class Solution3 {
    /**
     * 题目描述
     * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
     */
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.add(node);
    }

    public int pop() {
        if(!stack2.empty()){
            return stack2.pop();
        }
        while(!stack1.empty()){
            int num = stack1.pop();
            stack2.add(num);
        }
        return stack2.pop();

    }
}