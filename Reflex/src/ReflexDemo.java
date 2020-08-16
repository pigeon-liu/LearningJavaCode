import java.lang.reflect.Constructor;

public class ReflexDemo {

    public static void reflectNewInstance() {
        try {
            Class<?> classStudent = Class.forName("Student");
            Object objectStudent = classStudent.newInstance();
            Student student = (Student) objectStudent;
            System.out.println("获取学生对象" + student);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void reflectPrivateConstructor(){
        try {
            Class<?> classStudent = Class.forName("Student");
            //注意传入的参数
            //getDeclaredConstructor() 私有的
            Constructor<?> declaredConstructor = classStudent.getDeclaredConstructor(String.class,int.class);
            //公有的
            //Constructor<?> declaredConstructor = classStudent.getConstructor();
            declaredConstructor.setAccessible(true);
            Object objectStudent = declaredConstructor.newInstance("fighting",18);
            Student student = (Student) objectStudent;
            System.out.println("获取私有构造函数且修改姓名和年龄"+ student);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        reflectNewInstance();
        //reflectPrivateConstructor();
    }
}
