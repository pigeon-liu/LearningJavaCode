package demo;

class Node{
    int data;
    Node next;
    void Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class MyList {
    public Node head;
    //头插法
    public void addFirst(int data){
        Node node  = new Node();
        if (this.head == null){
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }
    //尾插法
    public void addLast(int data){
        Node node  = new Node();
        if (this.head == null){
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }
    //任意位置插入,第一个数据节点为0号下标
    public boolean addIndex(int index,int data){

        return true;
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while (cur.next != null){
            if (cur.data== key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        Node cur = this.head;
        while (cur.next != null){
            if (cur.next.data== key){
                cur = cur.next.next;
                return;
            }
            cur = cur.next;
        }
    }

    //删除所有值为key的节点
    public void removeAllKey(int key){
        Node cur = this.head;
        while (cur.next != null){
            if (cur.next.data == key){
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
    }

    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null){
            cur = cur.next;
            count++;
        }
        return count;
    }

    public void display(){
        Node cur = this.head;
        while (cur.next != null){
            System.out.print(cur.data +" ");
            cur = cur.next;
        }
        System.out.println();
    }

    public void clear(){
        this.head = null;
    }
}

