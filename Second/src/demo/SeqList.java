package demo;

import javax.xml.soap.Node;
import java.util.Arrays;

public class SeqList {
    public int[] arr;
    public int size;
    public int length = 10;

    public SeqList(){
        this.arr = new  int[length];
        this.size = 0;
    }
    
    // 打印顺序表
    public void display() {
        for (int i = 0;i<this.size;i++){
            System.out.print(this.arr[i] + " ");
        }
        System.out.println( );
    }

    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if (pos<0 || pos>this.size){
            return;
        }
        for (int i = this.size-1;i>=pos;i--){
            this.arr[i+1] = this.arr[i];
        }
        this.arr[pos] = data;
        this.size++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0;i<this.size;i++){
            if (this.arr[i] == toFind){
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i= 0; i <this.size;i++){
            if (this.arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if (this.size == 0){
            return -1;
        }else if (pos< 0 || pos>this.size){
            return -1;
        } else {
            return this.arr[pos];
        }

    }

    // 给pos位置的元素设为 value
    public void setPos(int pos, int value) {
        this.arr[pos] = value;
    }

    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        for (int i = 0;i<this.size;i++){
            if (this.arr[i] == toRemove){
                this.arr[i] = this.arr[i+1];
                break;
            }
        }
    }

    // 获取顺序表长度
    public int size() {
        return this.size;
    }

    // 清空顺序表
    public void clear() {
        this.size = 0;
    }
}
