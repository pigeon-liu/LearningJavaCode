package first.test;

//创建类
public class Person {
    //成员变量
    public String name;
    public int age;
    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void show(){
        System.out.println(name + "今年" + age + "岁啦~");
    }

    public static void main(String[] args) {
        Person person = new Person(); //通过关键字new实例化对象
        person.name = "冷";
        person.show();
    }
}
