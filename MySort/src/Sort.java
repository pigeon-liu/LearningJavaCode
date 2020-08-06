import java.util.Arrays;
import java.util.Random;

public class Sort {
    /**
     * 直接插入排序
     *
     * @param array
     * 时间复杂度：
     *      最坏：O(n^2)
     *      最好：O(n)
     *   越有序排序速度越快
     * 空间复杂度：O(1)    额外的空间
     * 稳定性：稳定的
     */
    public static void insertSort(int[] array){
        for (int i = 1; i<array.length;i++){
            int tmp = array[i];
            int j;
            for (j = i-1; j>=0; j--){
                if (array[j] > tmp){
                    array[j+1] = array[j];
                } else {
                    array[j + 1] = tmp;
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[10_000];
        Random random = new Random();
        for (int i = 0 ; i < arr.length;i++){
            arr[i] = random.nextInt();
        }

        long start= System.currentTimeMillis();
        insertSort(arr);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void main1(String[] args) {
        int[] arr = {10,1,3,2,6,8,9};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
