
class Animal{
    public void func(){
        System.out.println("Animal::func()");
    }
}
public class TestDemo4 {
    public static void main(String[] args) {
        //匿名内部类
        new Animal(){
            @Override
            public void func() {
                System.out.println("重写func()方法");
            }
        }.func();
    }
}
