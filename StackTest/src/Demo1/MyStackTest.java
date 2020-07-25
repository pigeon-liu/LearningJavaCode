package Demo1;

public class MyStackTest {
    public static void main(String[] args) {
        //MyStack<Integer> myStack = new MyStack<>();
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(3);
        myStack.push(5);
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.full());
        System.out.println(myStack.empty());
        System.out.println(myStack.size());
        //System.out.println(Arrays.toString(myStack);
        //myStack.push(2);
        //System.out.println(myStack);
    }
}
