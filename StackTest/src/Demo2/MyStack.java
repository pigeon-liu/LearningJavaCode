package Demo2;

import java.util.Arrays;
import java.util.Objects;

public class MyStack<T>{
    public T[] elem;
    public int top;
    public MyStack(){
        this.elem = (T[])new Object[10];
    }

    //入栈
    /*
     * 1、判断栈是否已满
     * 2、如果栈已满，进行扩容
     * 3、不满存放数据
     */
    public void push(T data){
        if (full()) {
            this.elem = Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[this.top] = data;
        this.top++;
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
    public T pop(){
        if (empty()) {
            throw new RuntimeException("栈空");
        }
        T data = this.elem[this.top-1];
        this.top--;
        return data;
    }
    //取出栈顶元素，但是不删除
    public T peek(){
        if (empty()) {
            throw new RuntimeException("栈空");
        }
        T data = this.elem[this.top-1];
        return data;
    }

    public int size(){
        return this.top;
    }

}
