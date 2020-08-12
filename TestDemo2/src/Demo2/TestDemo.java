package Demo2;

/**
 * 1、<T>: T占位符，表示当前类是泛型类
 * 2、放数据的时候可以自动进行类型检查
 * 3、取数据的时候可以自动进行类型转换
 * 4、泛型怎么编译？
 *      泛型在编译时期的一种机制 --》擦除机制 。
 *      编译的时候按照object编译，但是不是替换成object。
 * 5、泛型是有边界的
 *
 * 坑：
 * 1、不能 new 泛型类型的数组
 * 2、简单类型不能作为泛型类型的参数
 * 3、泛型类型的参数不参与类型的组成
 *
 */
class MyStack<T>{
    public T[] elem;
    public int top;

    public MyStack(){
        this.elem = (T[]) new Object[10];
    }

    public void push(T val){
        this.elem[this.top] = val;
        this.top++;
    }

    public T peek(){
        return this.elem[this.top-1];
    }
}

public class TestDemo {

    public static void main(String[] args) {
        MyStack<Integer> myStack = new MyStack();
        myStack.push(10);
        myStack.push(20);
        int ret = myStack.peek();
        System.out.println(ret);


        MyStack<String> myStack2= new MyStack();
        myStack2.push("hello");
        myStack2.push("world");

    }
    public static void main1(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(10);
        myStack.push("hello");

        String ret = (String) myStack.peek();
        System.out.println(ret);

    }
}
