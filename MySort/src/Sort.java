import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

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

    /**
     * 希尔排序
     * @param array
     * @param gap
     */
    public static void shell(int[] array,int gap){
        for (int i = gap;i<array.length;i++) {
            int tmp = array[i];
            int j;
            for (j = i - gap; j >= 0; j = j - gap) {
                if (tmp < array[j]) {
                    array[j + gap] = array[j];
                } else {
                    break;
                }
            }
            array[j+gap] = tmp;
        }
    }
    public static void shellSort(int[] array){
        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length;i++){
            shell(array,drr[i]);
        }
    }

    /**
     * 选择排序
     * @param array
     */
    public static void selectSort(int[] array){
        for (int i = 0;i<array.length;i++){
            for (int j = i+1;j<array.length;j++){
                if (array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }

    /**
     * 堆排序
     * @param arr
     */
    public static void HeapSort(int[] arr){
        creatHeap(arr);
        int end = arr.length-1;
        while (end > 0){
            int tmp = arr[0];
            arr[0] = arr[end];
            arr[end] = tmp;
            adjustDown(arr,0,end);
            end--;
        }
    }
    //调整
    public static void adjustDown(int[] arr,int root, int len){
        int parent = root;
        int child = 2*parent+1;
        while (child < len){
            if (child+1 < len && arr[child] < arr[child+1] ){
                child++;
            }
            if (arr[child] > arr[parent]){
                int tmp = arr[child];
                arr[child] = arr[parent];
                arr[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            } else {
                break;
            }
        }
    }
    //建堆
    public static void creatHeap(int[] arr){
        // i 表示每棵树的根
        for (int i =(arr.length-1-1)/2; i>=0;i--){
            adjustDown(arr,i,arr.length);
        }
    }
    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        // i 表示躺数
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
    }
    // 冒泡排序优化 O(n)
    public static void bubbleSort1(int[] arr){
        boolean flg = false;
        // i 表示躺数
        for (int i = 0;i<arr.length-1;i++){
            for (int j = 0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flg = true;
                }
            }
            if (flg == false){
                return;
            }
        }
    }

    /**
     * 快速排序
     * @param arr
     */
    public static void quickSort(int[] arr){
        quick(arr,0,arr.length-1);
    }
    //找基准
    public static int partition(int[] arr,int low, int high){
        int tmp = arr[low];
        while (low < high){

            while (low < high &&  arr[high] >= tmp){
                high--;
            }
            arr[low] = arr[high];
            while (low < high && arr[low] <= tmp){
                low++;
            }
            arr[high] = arr[low];
        }
        arr[low] = tmp;
        return low;
    }

    public static void quick(int[] arr,int left,int right){
        if (left >= right){
            return;
        }
        //优化 方式：当待排序序列的数据个数小于等于100的时候
        if (right - left +1 <= 100) {
            insert_sort(arr, left, right);
            return;
        }

        //数组有序优化，三数取中
        three_num_mid(arr,left,right);

        int par  = partition(arr,left,right);
        quick(arr, left, par-1);
        quick(arr,par+1,right);

    }

    //交换
    public static void swap(int[] arr ,int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    //三数取中
    public static void three_num_mid(int[] arr,int left,int right){
        //arr[mid]<=arr[left]<=arr[right]
        int mid = (left+right)/2;
        if (arr[left] > arr[right]){
           /* int tmp = arr[right];
            arr[right] = arr[left];
            arr[left] = tmp;*/
           swap(arr,left,right);
        }
        if (arr[mid] > arr[left]){
           /*int tmp = arr[left];
           arr[left] = arr[mid];
           arr[mid] = tmp;*/
            swap(arr,mid,left);
        }
        if (arr[mid] > arr[right]){
            /*int tmp = arr[right];
            arr[right] = arr[mid];
            arr[mid] = tmp;*/
            swap(arr,mid,right);
        }
    }
    public static void insert_sort(int[] arr,int start,int end){
        int tmp = 0;
        for (int i = start+1;i<=end;i++){
            tmp = arr[i];
            int j;
            for (j = i-1;j>=start;j--){
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
     * 非递归实现快速排序
     * @param arr
     */
     public static void quickSort1(int[] arr){
         Stack<Integer> stack = new Stack<>();

         int left = 0;
         int right = arr.length-1;
         int par = partition(arr,left,right);

         if (par > left+1){
             stack.push(left);
             stack.push(par-1);
         }
         if (par < right-1){
             stack.push(par+1);
             stack.push(right);
         }
         while (!stack.empty()){
             right = stack.pop();
             left = stack.pop();
             par = partition(arr,left,right);

             if (par > left+1){
                 stack.push(left);
                 stack.push(par-1);
             }
             if (par < right-1){
                 stack.push(par+1);
                 stack.push(right);
             }
         }
    }

    public static void mergeSortInternal(int[] arr,int left,int right){
         if (left >= right){
             return;
         }
         //分解
         int mid = (left+right)/2;
         //int mid = (left+right)>>>1;   无符号右移一位，相当于除二
         mergeSortInternal(arr,left,mid);
         mergeSortInternal(arr,mid+1,right);
         //合并
         merge(arr,left,mid,right);
    }

    //归并
    public static void merge(int[] arr,int left,int mid,int right){
        int s1 = left;
        int s2 = mid+1;
        int len = right-left+1;
        int[] ret = new int[len];
        int i = 0;  //用来表示ret数组的下标

        while (s1 <= mid && s2 <= right){
            if (arr[s1] <= arr[s2]){
                /*ret[i] = arr[s1];
                i++;
                s1++;*/
                ret[i++] = arr[s1++];
            } else {
               /* ret[i] = arr[s2];
                i++;
                s2++;*/
                ret[i++] = arr[s2++];
            }
        }

        while (s1 <= mid){
            ret[i++] = arr[s1++];
        }

        while (s2<=right){
            ret[i++] = arr[s2++];
        }

        for (int j = 0;j <= ret.length-1;j++){
            arr[j+left] = ret[j];
        }
    }

    /**
     * 归并排序
     * @param arr
     */
    public static void mergeSort1(int[] arr){
         mergeSortInternal(arr,0,arr.length-1);
    }

    /**
     * 非递归实现归并排序
     * @param arr
     */
    public static void mergeSort(int[] arr){
        for (int gap = 1; gap<arr.length; gap*=2){
            mergeNor(arr,gap);
        }

    }

    public static void mergeNor(int[] arr,int gap){
        int[] ret = new int[arr.length];
        int k = 0; //ret的下标
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 < arr.length ? s2+gap-1 :arr.length-1;

        //肯定有两个归并段
        while (s2 < arr.length){
            //对应s1和s2位进行比较
            while (s1<=e1 && s2<=e2) {
                if (arr[s1] > arr[s2]) {
                    ret[k++] = arr[s2++];
                } else {
                    ret[k++] = arr[s1++];
                }
            }
            //在比较的过程中你肯定有一个归并段先走完
            //判断是哪个没走完，把剩下的数据拷贝到结果数组当中
            while (s2 <= e2) {
                ret[k++] = arr[s2++];
            }
            while (s1 <= e1) {
                ret[k++] = arr[s1++];
            }

            //接着确定新的s1、e1、s2、e2
            s1 = e2+1;
            e1 = s1+gap-1;
            s2 = e1+1 ;
            e2 = s2+gap-1 < arr.length ? s2+gap-1 :arr.length-1;
        }
        //判断是否有另外的归并段
        while (s1 <= arr.length-1){
            ret[k++] = arr[s1++];
        }

        for (int i = 0;i<ret.length;i++){
            arr[i] = ret[i];
        }
    }

    public static void main(String[] args) {
        int[] arr2 = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        //selectSort(arr2);

        //bubbleSort(arr2);
        //bubbleSort1(arr2);

        //HeapSort(arr2);

        //quickSort(arr2);
        //quickSort1(arr2);

        mergeSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    public static void main3(String[] args) {
        /*int[] arr1 = {5,8,22,54,6,9,7,56,89,0,4,12,33,34,89,77};
        shellSort(arr1);
        System.out.println(A rrays.toString(arr1));*/

        int[] arr2 = {12,5,9,34,6,8,33,56,89,0,7,4,22,55,77};
        shellSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }



    public static void main2(String[] args) {
        int[] arr = new int[10_000];
        Random random = new Random();
        for (int i = 0 ; i < arr.length;i++){
            arr[i] = i;
            //arr[i] = random.nextInt(10_000);
        }

        //时间差
        long start= System.currentTimeMillis();
        //selectSort(arr);
        //quickSort(arr);
        quickSort1(arr);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void main1(String[] args) {
        int[] arr = {10,1,3,2,6,8,9};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
