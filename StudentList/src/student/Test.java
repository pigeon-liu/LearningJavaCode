package student;

import java.util.*;
/*
若干学生，学生对象放在一个List中，每个学生有姓名，班级，成绩三个属性。
某次考试结束后，每个学生获得一个成绩。
遍历List集合，并把学生对象的属性打印出来。
 */
class Student{
    public String name;
    public String grades;
    public double result;

    public Student(String name, String grades, double result){
        this.name = name;
        this.grades = grades;
        this.result = result;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGrades(String grades) {
        this.grades = grades;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getName() {
        return name;
    }

    public String getGrades() {
        return grades;
    }

    public double getResult() {
        return result;
    }

    @Override
    public String toString(){
        return "Student {" +
                "name=" + name +
                ",grades="+ grades +
                ",result="+result +
                "}\n";
    }
}

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student("liu","三班",78);
        Student student2 = new Student("leng","三班",69);
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        System.out.println(list);

    }
}
