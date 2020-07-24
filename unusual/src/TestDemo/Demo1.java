package TestDemo;

public class Demo1 {
    public static void main(String[] args) {
        int x = func(2,0);
        System.out.println(x);
    }

    public static int func(int x,int y){
        if (y == 0){
            throw new ArithmeticException("抛出除数为0的异常");
        }
        return x/y;
    }
    public static void main2(String[] args) {
        int[] arr = {1,2,3};
        try {
            System.out.println("====1=====");
            arr = null;
            System.out.println(arr[5]);
            System.out.println("====2=====");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界异常");
            e.printStackTrace();
        }  catch (NullPointerException e){
            System.out.println("空指针异常");
            e.printStackTrace();
        }
        System.out.println("调用try catch");
    }
    public static void main1(String[] args) {
        int[] arr = {1,2,3};
        System.out.println("====1=====");
        System.out.println(arr[5]);
        System.out.println("====2=====");
    }
}
