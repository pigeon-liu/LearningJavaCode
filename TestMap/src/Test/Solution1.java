package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 */

public class Solution1 {
    public static int singleNumber1(int[] nums) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            ret ^= nums[i];
        }
        return ret;
    }

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer val : nums){
            if (set.contains(val)){
                set.remove(val);
            } else {
                set.add(val);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();

    }


    public static void main(String[] args) {
        int[] arr = {2,4,2,4,5};
        System.out.println(singleNumber(arr));
    }
}
