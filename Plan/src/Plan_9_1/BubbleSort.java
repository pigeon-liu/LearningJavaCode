package Plan_9_1;

import java.util.Arrays;

/**
 * 冒泡排序
 */
public class BubbleSort {
    public int[] bubbleSort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = 0;j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {2,6,3,9,13,45,1,67};
        BubbleSort t = new BubbleSort();
        int[] array = t.bubbleSort(arr);
        System.out.println(Arrays.toString(array));
    }
}
