package Niuke9_4;

public class Solution5 {
    /**
     * 直接插入排序
     * @param arr
     */
    public void insterSort(int[] arr){
        for (int i = 1;i<arr.length;i++){
            int tmp = arr[i];
            int j;
            for(j = i-1;j>=0;j--){
                if (arr[j] > tmp){
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = tmp;
        }
    }

    /**
     * 选择排序
     * 第一轮，选出最小的放在以地为
     * @param arr
     */
    public void selectSort(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int [] arr = {12,32,22,7,43};
        Solution5 test = new Solution5();
        //test.insterSort(arr);

        test.selectSort(arr);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }

    }
}
