package Demo1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//求前K个最大的 -- 建大小为K的小堆
//求前K个最小的 -- 建大小为K的大堆

class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}
public class TopK {
    public static Integer[] topK(int[] arr,int k){

        MyComparator myComparator = new MyComparator();
        //建堆（大堆）
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>(myComparator);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for (int i = 0 ;i<arr.length;i++){
            if (maxHeap.size() < k){
                maxHeap.offer(arr[i]);
            } else {
                Integer val = maxHeap.peek();
                //拿到堆顶元素和数组比较
                if (val != null && val > arr[i]){
                    maxHeap.poll();
                    maxHeap.offer(arr[i]);
                }
            }
        }

        Integer[] ret = new Integer[k];
        for (int i = 0 ; i <k;i++){
            int m = maxHeap.poll();
            ret[i] = m;

        }
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {13,6,221,65,23,76,32,88,24,56 ,67};
        Integer[] ret = topK(array,5);
        System.out.println(Arrays.toString(ret));
    }
}
