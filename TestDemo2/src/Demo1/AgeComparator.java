package Demo1;

import java.util.Comparator;

/**
 * 年龄比较器
 */
public class AgeComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}
