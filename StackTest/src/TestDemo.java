import java.util.Stack;

public class TestDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(5);
        stack.push(9);
        stack.push(4);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.search(5));
        System.out.println(stack.peek());  //拿到栈顶元素但不删除
        ///System.out.println(stack.empty());
    }

}
