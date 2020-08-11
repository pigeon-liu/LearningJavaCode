/**
 * 内部类：
 * 1、实例内部类；
 * 2、静态内部类
 * 3、匿名内部类
 *
 */

/* 实例内部类
class OuterClass{
    public int data1 = 8;
    public int data2 = 6;

    //实力内部类，可以看做一个普通的实例数据成员
    class InnerClass{
        public int data3 = 9;
        public int data1 = 5;

        public void func(){
            //this是一个静态的引用
            System.out.println(this.data1);
            //外部类对象的引用
            System.out.println(OuterClass.this.data1);

            //局部变量优先
            System.out.println(data1);
            System.out.println(data2);
            System.out.println(data3);
            System.out.println("innerclass func");
        }
    }
}*/

//静态内部类
class OuterClass{
    public int data1 = 8;
    public static int data2 = 6;
    private int data4 = 4;

    /**
     * 静态内部类当中不能访问外部类的非静态数据成员
     *
     * 非要进行访问：
     */
    static class InnerClass{
        public int data3 = 9;
        public int data1 = 5;
        public OuterClass out;
        //构造方法，传进外部对象类引用
        public InnerClass(OuterClass out){
            this.out = out;
        }
        //外部类一个静态成员属性
        public void func(){
            System.out.println(data1);
            //data2 是静态的，类也是静态的，可以访问
            System.out.println(data2);
            System.out.println(data3);
            System.out.println("innerclass func");
            //System.out.println(data4);     error
            System.out.println(this.out.data4);
        }
    }
}

public class TestDemo5 {

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        //拿到静态内部类对象
        OuterClass.InnerClass innerClass = new OuterClass.InnerClass(outerClass);
        innerClass.func();
    }
    /*public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }*/
}
