package HashTest;

import java.util.Objects;

/**
 * 比： 确定位置
 * 查找 比特，比心
 * 对比哪个词是我要找到次  equal()方法
 */
class Person{
    public int id;

    public Person(int id){
        this.id = id;
    }

    //如果不重写hashcode在找对应位置的时候找不对
    //如果不重写equal方法，找到位置，对比每个节点对象时，相同的key值不覆盖
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

public class HashBuck2 <K,V>{

    static class Node<K,V>{
        public K key;
        public V val;
        public Node<K,V> next;

        public Node(K key,V val){
            this.key = key;
            this.val = val;
        }
    }

    public Node<K,V>[] array = (Node<K,V>[])new Node[10];
    public int usedSize;

    public void put(K key,V val){
        //调用hashCode生成下标
        int hash = key.hashCode();
        //下标变成合法下标
        int index = hash % array.length;

        for (Node cur = array[index];cur!= null;cur = cur.next){
            //引用类型，使用重写过得equal方法判断是否相等
            if (cur.key.equals(key)){
                //覆盖
                cur.val = val;
                return;
            }
        }
        Node<K,V> node = new Node<>(key,val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;

        if (loadFactir() > 0.75){
            resize();
        }
    }

    public void resize(){
        Node<K,V>[] newArray = (Node<K, V>[]) new Node[2*this.array.length];
        for (int i = 0;i<array.length;i++){
            Node<K,V> cur = array[i];
            while (cur != null){
                int hash = cur.key.hashCode();
                int index = hash % newArray.length;
                Node<K,V> curNext = cur.next;
                cur.next = newArray[index];
                newArray[index] = cur;
                cur = curNext;
            }
        }
        array = newArray;
    }

    public double loadFactir(){
        return this.usedSize*1.0 / this.array.length;
    }
    public V get(K key){
        //找位置
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        //遍历链表，返回val值
        while (cur != null){
            if (cur.key.equals(key)){
                return cur.val;
            }
            cur = cur.next;
        }
        return null;
    }

    public static void main(String[] args) {
        Person person1 = new Person(12);
        Person person2 = new Person(12);
        HashBuck2<Person, String> map = new HashBuck2<>();
        map.put(person1,"leng");
        System.out.println(map.get(person2));
    }

    public static void main1(String[] args) {
        Person person1 = new Person(12);
        Person person2 = new Person(12);

        System.out.println(person1.equals(person2));
        System.out.println(person1.hashCode());
        System.out.println(person2.hashCode());

    }
}
