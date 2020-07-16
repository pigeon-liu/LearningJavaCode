package first;

public class Student {
    private String name;
    private  int age;

    public Student(String name ,int age){
        this.name = name;
        this.age = age;
    }
    public void show(){
        System.out.println("name:"+name+"  age:" +age);
    }

    //重写Object的toString方法
    @Override
    public String toString(){
        return "Person{"+
                "name：'"  + name + '\'' +
                " age:" + age  +
                "}";

    }
    /*public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }*/

    public static void main(String[] args) {
        Student student = new Student("这就",3);
        student.show();
        System.out.println(student);
        /*Student student = new Student();
        student.setName("就这");
        student.setAge(3);
        String sName = student.getName();
        int sAge = student.getAge();
        System.out.println(sName);
        System.out.println(sAge);*/
    }
}

