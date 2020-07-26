package Demo2;

public class MyCircularQueueTest {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue = new MyCircularQueue(10);
        System.out.println(myCircularQueue.isEmpty());
        myCircularQueue.enQueue(2);
        myCircularQueue.enQueue(5);
        myCircularQueue.enQueue(13);
        myCircularQueue.enQueue(25);
        myCircularQueue.enQueue(3);
        myCircularQueue.enQueue(6);
        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.Rear());
        System.out.println(myCircularQueue.deQueue());
        System.out.println(myCircularQueue.Front());
        System.out.println(myCircularQueue.isEmpty());
        System.out.println(myCircularQueue.isFull());
    }
}
