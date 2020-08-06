package Demo1;

import java.util.Arrays;

public class TestDemo1 {
    /**
     * 统计一个数字在排序数组中出现的次数
     * @param nums
     * @param target
     * @return
     */
    public static int search(int[] nums, int target) {
        int count = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] == target){
                count++;
            }
        }
        return count;
    }

    /**
     * 删除数组中的重复项
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        int i= 0;
        for (int j =1;j<nums.length;j++) {
            if (nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }

    /**
     * 移出元素
     * @param nums
     * @param val
     * @return
     */
    public static int removeElement(int[] nums, int val) {
        int len = nums.length;
        int i = 0;
        for (int j = 0;j<nums.length;j++){
            if(nums[j] != val){
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] arr1 = {5,7,7,8,8,10};
        System.out.println(search(arr1, 8));
        System.out.println(search(arr1, 6));

        int count1 = removeDuplicates(arr1);
        System.out.println(count1);
        System.out.println(Arrays.toString(arr1));

        int count2 = removeElement(arr1,7);
        System.out.println(count2);
        System.out.println(Arrays.toString(arr1));

    }
}
