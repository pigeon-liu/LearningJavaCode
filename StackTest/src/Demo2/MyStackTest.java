package Demo2;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack<>();
        myStack.push(2);
        myStack.push(23);
        myStack.push(3);
        myStack.push(5);
        myStack.push(14);
        System.out.println(myStack.peek());  //14
        System.out.println(myStack.pop()); //14
        System.out.println(myStack.peek());  //5
        System.out.println(myStack.size());  //4
        System.out.println(myStack.empty());   //false
        System.out.println(myStack.full());   //false
    }

}
