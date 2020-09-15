package Niuke9_15;

public class Solution2 {
    public static int InversePairs(int [] array) {
        if(array.length<=1){
            return 0;
        }
        int count = 0;
        for(int i = 0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    count++;
                }
            }

        }
        int ret = count % 1000000007;
        return ret;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,0};
        System.out.println(InversePairs(arr));
    }
}
