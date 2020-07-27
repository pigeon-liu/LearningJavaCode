import com.sun.corba.se.impl.orb.PrefixParserData;

import java.util.Stack;

public class MyQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;
    public MyQueue(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void push(int x){
        stack1.add(x);
    }

    public int pop(){
        int data = 0;
        int size1 = stack1.size();
        if (stack2.isEmpty()){
            if (stack1.isEmpty()){
                return -1;
            } else {
                for (int i = 0;i<size1;i++){
                    data = stack1.pop();
                    stack2.push(data);
                }
            }
        }
        data = stack2.pop();
        return data;
    }

    public int peek(){
        int size1 = stack1.size();
        if (stack2.isEmpty()){
            if (stack1.isEmpty()){
                return -1;
            } else {
                for (int i = 0;i<size1;i++){
                    int data = stack1.pop();
                    stack2.push(data);
                }
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }

}
