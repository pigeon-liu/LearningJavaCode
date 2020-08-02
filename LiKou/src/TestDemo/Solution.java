package TestDemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List< List<Integer> > ret = new LinkedList<>();
        for(int i = nums.length-1;i >= 0;i--){
            for(int j = 0;j < i;j++){
                for(int k = j +1;k < i;k++){
                    if(nums[j] + nums[k] + nums[i] == 0){
                        List<Integer> list = new LinkedList<>();
                        list.add(nums[i]);
                        list.add(nums[k]);
                        list.add(nums[j]);
                        ret.addAll(list);
                    }
                }

            }
        }

        return ret;
    }

    public static void main(String[] args) {

    }
}
