package Demo;

import java.util.Arrays;

/**
 * 缺点：每次业务不同，需要修改类本身。（比较的东西不同，休要修改compareTo()方法）
 *
 * 重点：自定义类型 为什么要实现可比较？
 */
class Student implements Comparable<Student>{
    public String name;
    public int age;
    public int score;

    public Student(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Student o) {
        //当前年龄是否大于传入年龄
        //return this.age-o.age; //排序从小到大
        return o.age-this.age;  ////排序从大到小
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo2 {

    public static void main(String[] args) {
        Student student1 = new Student("liu",16,89);
        Student student2 = new Student("cheng",19,76);
        Student student3 = new Student("ge",18,98);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        //根据年龄排序 compareTo()方法
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }

    public static void main1(String[] args) {
        Student student1 = new Student("liu",16,89);
        Student student2 = new Student("cheng",19,76);
        if (student1.compareTo(student2) < 0){
            System.out.println("student1年龄大于student2年龄");
        }
    }
}
