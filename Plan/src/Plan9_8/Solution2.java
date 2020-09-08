package Plan9_8;

public class Solution2 {
    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            //最起码有左孩子
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    public static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i>= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    public static void heapSort(int[] array) {
        createHeap(array);
        int end = array.length-1;
        while (end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }


}
