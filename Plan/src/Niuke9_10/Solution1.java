package Niuke9_10;

public class Solution1 {
    /**
     *统计一个数字在升序数组中出现的次数。
     */
    public int GetNumberOfK(int [] array , int k) {
        int count = 0;
        for(int i = 0;i<array.length;i++){
            if(array[i] > k){
                break;
            } else if(array[i] == k){
                count++;
            }
        }
        return count;
    }
}
