package Demo2;

import java.util.ArrayList;
import java.util.Arrays;


//写一个通用的方法，打印集合当中的所有元素
class GenericList{
    public static <T> void printList(ArrayList<T> list) {
        for (T val: list) {
            System.out.print(val+" ");
        }
        System.out.println();
    }

    /**
     * 通配符：也是一种泛型
     * 通配符一般用于读取  add(?)
     * 泛型用于写入  add(T)
     *
     * 通配符  既有上界extend  也有下界super
     */
    public static void printList2(ArrayList<?> list) {
        for (Object val: list) {
            System.out.print(val+" ");
        }
        System.out.println();
    }

}
public class TestDemo3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        GenericList.printList2(list);

    }
}
