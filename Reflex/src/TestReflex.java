
class Student{
    //私有属性
    private String name = "fight";
    //公有属性
    public int age = 18;
    //不带参数的构造方法
    public Student(){
        System.out.println("Student()");
    }
    //带参数的私有构造方法   (类外不能调用)
    private Student(String name,int age){
        this.name = name;
        this.age = age;
    }

    //私有方法x
    private void eat(){
        System.out.println("I am eat");
    }
    //共有方法
    public void sleep(){
        System.out.println("I am sleep");
    }

    private void func(String str){
        System.out.println(str);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestReflex {
    public static void main(String[] args) {
        //Student获取Class对象
        Class c1 = null;
        try {
            //若在其他包里，需加 包名.
            c1 = Class.forName("Student");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Class c2 = Student.class;  //直接类名.class

        Student student1 = new Student();
        Class c3 = student1.getClass();

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c1 == c3);


    }

}
