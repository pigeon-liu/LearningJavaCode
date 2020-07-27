
import java.util.Stack;

public class MyStack {
    Stack<Integer> stack ;
    Stack<Integer> minstack;
    /*public int[] elem;
    public int top;*/

    public MyStack() {
        stack = new Stack<>();
        minstack = new Stack<>();

    }

    public void push(int x) {
        MyStack myStack = new MyStack();
        if (stack.isEmpty()){
            stack.push(x);
            minstack.push(x);
        } else {
            if (x <= minstack.peek()){
                stack.push(x);
                minstack.push(x);
            } else {
                stack.push(x);
            }
        }

    }
    public void pop() {
        if (stack.isEmpty()){
            return;
        }
        if (stack.peek() > minstack.peek()){
            stack.pop();
        } else {
            stack.pop();
            minstack.pop();
        }
    }

    public int top() {
        if (stack.isEmpty()){
            return -1;
        }
        return stack.peek();
    }

    public int getMin() {
        if (minstack.isEmpty()){
            return -1;
        }
       return minstack.peek();

    }
}
