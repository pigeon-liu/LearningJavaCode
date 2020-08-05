import java.util.Arrays;


public class Test {
    public static void main(String[] args) {

        /*int[] array = new int[10_0000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;

        }
        long start = System.currentTimeMillis();
        TestSort.heapSort(array);
        long end =  System.currentTimeMillis();
        System.out.println(end-start);*/
        int[] array = {12,5,9,34,6,8,33,56,7,4,22,55,77};
        System.out.println(Arrays.toString(array));
        TestSort.bubbleSort(array);
        System.out.println(Arrays.toString(array));

    }
}
