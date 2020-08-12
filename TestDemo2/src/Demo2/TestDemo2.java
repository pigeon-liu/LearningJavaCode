package Demo2;

import java.util.Arrays;

/**
 * T extends Comparable<T>  上界
 * T一定实现Comparable接口
 *
 * 没有下界
 * @param <T>
 */
class Generic<T extends Comparable<T>>{
    public T maxNum(T[] elem){
        T max = elem[0];
        for (int i = 1;i<elem.length;i++){
            if (elem[i].compareTo(max) > 0){
                max = elem[i];
            }
        }
        return max;
    }
}

class Generic2 {
    public static <T extends Comparable<T>> T maxNum(T[] elem){
        T max = elem[0];
        for (int i = 1;i<elem.length;i++){
            if (elem[i].compareTo(max) > 0){
                max = elem[i];
            }
        }
        return max;
    }
}

/**
 * 类型的推导
 *      根据实参的类型推导出形参的类型
 */
public class TestDemo2 {
    public static void main(String[] args) {
        Integer[] array = {12,45,23,65,76,3,25,6,8,2};
        System.out.println(Generic2.maxNum(array));
        String[] arr = {"abc","hello","def"};
        System.out.println(Generic2.maxNum(arr));
    }
    public static void main1(String[] args) {
        Generic<Integer> generic = new Generic<>();
        Integer[] array = {12,45,23,65,76,3,25,6,8,2};
        System.out.println(generic.maxNum(array));

        Generic<String> generic2 = new Generic<>();
        String[] arr = {"abc","hello","def"};
        System.out.println(generic2.maxNum(arr));
    }
}
