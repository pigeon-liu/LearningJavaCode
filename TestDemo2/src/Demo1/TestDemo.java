package Demo1;


import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * 比较器
 */

class Person{
    public String name;
    public int age;
    public int score;

    public Person(String name,int age,int score){
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }
}
public class TestDemo {

    public static void main(String[] args) {
        AgeComparator ageComparator = new  AgeComparator();

        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(ageComparator);
        priorityQueue.offer(new Person("leng",23,66));
        priorityQueue.offer(new Person("gezi",18,88));

        System.out.println(priorityQueue);
    }

    public static void main2(String[] args) {
        Person person1 = new Person("liu",16,89);
        Person person2 = new Person("cheng",19,76);
        Person person3 = new Person("ge",18,98);

        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        AgeComparator ageComparator = new AgeComparator();

        Arrays.sort(people,ageComparator);
        System.out.println(Arrays.toString(people));
    }
    public static void main1(String[] args) {
        Person person1 = new Person("liu",16,89);
        Person person2 = new Person("cheng",19,76);
        Person person3 = new Person("ge",18,98);

        AgeComparator ageComparator = new AgeComparator();
        System.out.println((ageComparator.compare(person1, person2)));

        ScoreComparator scoreComparator = new ScoreComparator();
        System.out.println(scoreComparator.compare(person1, person2));
    }
}