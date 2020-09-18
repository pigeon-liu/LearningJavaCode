package Niuke9_17;
import java.util.*;
public class Solution6 {
    /**
     * 输入n个整数，找出其中最小的K个数。
     * @param input
     * @param k
     * @return
     */
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if(k > input.length){
            return list;
        }
        sort(input);
        int i = 0;
        while( k > 0){
            list.add(input[i]);
            ++i;
            --k;
        }
        return list;
    }

    /**
     * 对数组数进行顺序排序
     * @param arr
     */
    public void sort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0;j < arr.length-i-1;++j){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
}