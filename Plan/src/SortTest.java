

public class SortTest {

    /**
     * 实现快排
     */
    public void quick(int[] arr,int left,int right){
        if (left > right){
            return;
        }
        int i = left;
        int j = right;
        // 存放基准数
        int tmp = arr[left];
        while (i < j){
            // 从右向左循环，找大于等于基准数的位置
            while (arr[j] >= tmp && i < j){
               j--;
            }
            // 从左向右循环，找小于等于基准数的位置
            while (arr[i] <= tmp && i < j){
                i++;
            }
            // 判断若 i 还在 j 的左边则交换两个位置的值
            if (i<j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        //基准数放到中间
        arr[left] = arr[i];
        arr[i] = tmp;


        // 递归基准数左边的数组
        quick(arr,left,i-1);
        // 递归基准数右边的数组
        quick(arr,i+1,right);
    }

    public static void main(String[] args) {
        int[] arr ={2,6,9,3,5,12,76,23};
        SortTest test = new SortTest();
        test.quick(arr,0,arr.length-1);
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
