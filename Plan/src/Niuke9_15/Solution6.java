package Niuke9_15;

import java.util.Arrays;

public class Solution6 {
    public void func(int[] arr,int left,int right){
        if (left >= right){
            return;
        }
        int tmp = arr[left];
        int i = left;
        int j = right;
        while (i<j){
            while (arr[j] <= tmp && i<j){
                j--;
            }
            while (arr[i] >= tmp && i<j){
                i++;
            }
            if (i<j){
                int ret = arr[i];
                arr[i] = arr[j];
                arr[j] = ret;
            }
        }
        arr[left] = arr[i];
        arr[i] = tmp;
        func(arr,0,i);
        func(arr,i+1,right);
    }

    public static void main(String[] args) {
        Solution6 t = new Solution6();
        int[] arr = {3,6,4,8,7,9,2,5,10,0,1};
        t.func(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
