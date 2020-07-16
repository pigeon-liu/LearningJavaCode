package first.test;

class TestDemo{
    public int x ;
    public static int y ;
    public static void func(){
        y = 100;
    }

}
public class Test {
    public static void main(String[] args) {
        TestDemo.func();
        System.out.println(TestDemo.y);

        /*TestDemo td1 = new TestDemo();
        td1.x++;
        TestDemo.y++;
        System.out.println(td1.x);
        System.out.println(TestDemo.y);
        System.out.println("===========");
        TestDemo td2 = new TestDemo();
        td2.x++;
        TestDemo.y++;
        System.out.println(td2.x);
        System.out.println(TestDemo.y);*/
    }
}


