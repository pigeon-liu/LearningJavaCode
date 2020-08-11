package Demo1;

import java.util.Comparator;
/**
 * 成绩比较器
 */
public class ScoreComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.score-o2.score;
    }
}
