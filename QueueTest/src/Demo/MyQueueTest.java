package Demo;

public class MyQueueTest {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        System.out.println(myQueue.isEmpty());
        myQueue.offer(2);
        myQueue.offer(4);
        myQueue.offer(9);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.isEmpty());
    }
}
