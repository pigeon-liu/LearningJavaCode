package first.test;

public class Teacher {
    private String name;
    private String sex;
    private int age;

    public Teacher(){
        this("啾咪","女",3); //this调用构造函数，必须显式放在第一行
    }

    //构造函数重载
    public Teacher(String name,String sex,int age){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public void show(){
        System.out.println("name:"+ name+"  sex:"+sex+"  age:"+age);
    }
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.show();
    }
}
