public class Test {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(2);
        myQueue.push(4);
        myQueue.push(5);
        myQueue.push(3);
        System.out.println(myQueue.peek());   //2
        System.out.println(myQueue.pop());      //2
        myQueue.push(7);
        System.out.println(myQueue.pop());    //4
        System.out.println(myQueue.peek());  //5
        System.out.println(myQueue.pop());   //5
        System.out.println(myQueue.pop());   //3
        System.out.println(myQueue.empty());
        System.out.println(myQueue.pop());      //7
        System.out.println(myQueue.empty());

    }

}
