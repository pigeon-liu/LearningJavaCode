package Demo1;

import java.util.Arrays;

public class MyStack{
    public int[] elem;
    public int top;
    public MyStack(){
        this.elem = new int[10];
    }


    //入栈
    /*
     * 1、判断栈是否已满
     * 2、如果栈已满，进行扩容
     * 3、不满存放数据
     */
    public void push(int val){
        if (full()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.top++] = val;
    }

    //判断栈是否为空
    public boolean empty(){
        return this.top == 0;
    }

    //判断栈是否已经满了
    public boolean full(){
        return this.top == this.elem.length;
    }
    //出栈，并删除栈顶元素
    public int pop(){
        if (empty()){
            throw new RuntimeException("栈空");
        }
        int data = this.elem[this.top-1];
        this.top--;
        return data;

    }
    //取出栈顶元素，但是不删除
    public int peek(){
        if (empty()){
            throw new RuntimeException("栈空");
        }
        int data = this.elem[this.top-1];
        return data;
    }

    public int size(){
        return this.top;
    }

}