package Demo;

//链式队列

class Node{
    public int data;
    public Node next;
    public Node(int data){
        this.data = data;
    }
}
public class MyQueue {
    public Node head;
    public Node tail;
    public int userSize;
    public boolean offer(int val){
        Node node = new Node(val);
        if (this.head == null){
            this.head = node;
            this.tail = node;
        } else {
            this.tail.next =node;
            this.tail = node;
        }
        this.userSize++;
        return true;
    }

    //出队，且删除队头元素
    public int poll(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        int ret = this.head.data;
        this.head = this.head.next;
        return ret;

    }

    //出队，不删除队头元素
    public int peek(){
        if (isEmpty()){
            throw new RuntimeException("队列为空");
        }
        return this.head.data;
    }

    //判空
    public boolean isEmpty(){
        return this.userSize == 0;
    }

    //长度
    public int size(){
        return this.userSize;
    }
}
