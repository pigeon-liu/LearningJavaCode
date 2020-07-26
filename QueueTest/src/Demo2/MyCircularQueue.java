package Demo2;


public class MyCircularQueue {
    public int[] elem;
    public int front;
    public int rear; //表示当前可以存放数据的下标
    public MyCircularQueue(int k){
        this.elem = new int[k];
    }

    //入队
    public boolean enQueue(int val){
        if (isFull()) {
            return false;
        }
        this.elem[this.rear] = val;
        this.rear = (this.rear+1) % this.elem.length;
        return true;
    }

    //判空
    /*当front==raer时，队列为空*/
    public boolean isEmpty(){
        if (this.front == this.rear){
            return true;
        }
        return false;
    }

    //判满
    /*浪费一个空间，如果rear的下一个下标是front时，队列满*/
    public boolean isFull(){
        if((this.rear+1) % this.elem.length == this.front) {
            return true;
        }
        return false;
    }

    //出队
    public boolean deQueue(){
        if (isEmpty()){
            return false;
        }
        this.front = (this.front+1)%this.elem.length;
        return true;
    }

    //取队头元素
    public int Front(){
        if (isEmpty()) {
            return -1;
        }
        return this.elem[this.front];
    }

    //取队尾元素
    public int Rear(){
        if (isEmpty()){
            return -1;
        }
        int index = this.rear == 0 ? this.elem.length-1 : this.rear-1;
        return this.elem[index];
    }
}
