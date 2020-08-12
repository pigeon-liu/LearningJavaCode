package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 给定字符串J 代表石头中宝石的类型，和字符串 S代表你拥有的石头。
 *      S 中每个字符代表了一种你拥有的石头的类型，你想知道你拥有的石头中有多少是宝石。
 *
 * J 中的字母不重复，J 和 S中的所有字符都是字母。字母区分大小写，因此"a"和"A"是不同类型的石头。
 *
 */
public class Solution3 {
    public static int numJewelsInStones(String J, String S) {
        Set<Character> set = new HashSet<>();

        //遍历宝石
        for (char j : J.toCharArray()){
            set.add(j);
        }
        /*char[] chars = J.toCharArray();
        for (int i = 0;i<chars.length;i++){
            set.add(chars[i]);
        }*/

        //遍历石头
        int count = 0;
        for (char s : S.toCharArray()){
            if (set.contains(s)){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String str1 = "aA";
        String str2 = "aAAbbbb";
        System.out.println(numJewelsInStones(str1, str2));
    }
}
