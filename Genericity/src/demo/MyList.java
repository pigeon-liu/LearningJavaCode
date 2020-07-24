package demo;

import java.util.Objects;

public class MyList<T> {
    public T[] elem;
    public int usedSize;

    public MyList(){
        //this.elem = new T[10];
        this.elem = (T[]) new Objects[10];
        this.usedSize = 0;
    }
    //默认在最后加
    public void add(T val){
        this.elem[this.usedSize] = val;
        this.usedSize++;
    }

    //获取pos位置的元素
    public T getVal(int pos){
        return this.elem[pos];
    }
}
