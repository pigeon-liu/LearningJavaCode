package demo;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add(1,"leng");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("wo");
        list1.add(0,"de");

        list.addAll(list1);
        System.out.println(list);
    }
}
