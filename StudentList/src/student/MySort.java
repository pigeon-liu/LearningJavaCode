package student;

import java.util.*;
/*
*有一个List当中存放的整形数据，要求使用Collections.sort对List进行排序
*/
public class MySort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(23);
        list.add(14);
        list.add(2);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}
