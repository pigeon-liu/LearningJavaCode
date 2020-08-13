package HashTest;

class HashBuck{
    static class Node{
        public int key;
        public int val;
        public Node next;

        public Node(int key,int val){
            this.key = key;
            this.val = val;
        }
    }

    public Node[] arr = new Node[10];
    public int usedSize;

    public void put(int key,int val){
        //通过设计哈希函数找到对应的位置
        int index  = key % arr.length;
        //遍历链表
        for (Node cur = arr[index]; cur != null; cur = cur.next){
            //key值相同更新val值
            if (cur.key == key){
                cur.val = val;
                return;
            }
        }
        //循环结束，没有找到key值，采用头插法插入节点
        Node node = new Node(key,val);
        node.next = arr[index];
        arr[index] = node;
        this.usedSize++;

        //如果负载因子大于0.75，进行扩容
        if (loadFactor() > 0.75){
            resize();
        }
    }

    //扩容  需要重新哈希 11%10=1   11%20=11
    public void resize(){
        Node[] newArr = new Node[2*this.arr.length];

        for (int i =0;i<arr.length;i++){
            Node cur = arr[i];
            while (cur != null){
                //记录下一个节点
                Node curNext = cur.next;
                //新的哈希函数，确定新的位置
                int index  = cur.key % newArr.length;

                cur.next = newArr[index];
                newArr[index] = cur;
                cur = curNext;
            }
        }
        arr = newArr;
    }
    //负载因子计算
    public double loadFactor(){
        return this.usedSize*1.0/this.arr.length;
    }

    public int get(int key){
        int index = key % arr.length;
        Node cur = arr[index];
        //遍历链表
        while (cur != null){
            if (cur.key == key){
                return cur.val;
            }
            cur = cur.next;
        }
        return -1;
    }
}
public class HashTestDemo {
    public static void main(String[] args) {
        HashBuck hashBuck = new HashBuck();
        for (int i =  1;i<8;i++) {
            hashBuck.put(i,i);
        }
        hashBuck.put(11,101);
        hashBuck.put(8,15);

        System.out.println(hashBuck.get(6));
        System.out.println(hashBuck.get(11));
        System.out.println(hashBuck.get(8));
    }

}
