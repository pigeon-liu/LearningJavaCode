package Test;

import java.util.HashSet;
import java.util.Scanner; 

/**
 * 输入在2行中分别给出应该输入的文字、以及实际被输入的文字。每段文字是不超过80个字符的串，由字母A-Z（包括大、小写）、数字0-9、
 * 以及下划线“_”（代表空格）组成。题目保证2个字符串均非空。
 *
 * 按照发现顺序，在一行中输出坏掉的键。其中英文字母只输出大写，每个坏键只输出一次。题目保证至少有1个坏键。
 */
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expected = scanner.nextLine();
        String actual = scanner.nextLine();

        //把实际的字符转为大写放到集合中
        HashSet<Character> setActual = new HashSet<>();
        for (char s: actual.toUpperCase().toCharArray()) {
            setActual.add(s);
        }

        HashSet<Character> setBroken = new HashSet<>();
        for (char ex: expected.toUpperCase().toCharArray()) {
            if (!setActual.contains(ex) && !setBroken.contains(ex)){
                System.out.print(ex);
                setBroken.add(ex);
            }
        }

    }
}
