
import java.util.ArrayList;

import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //boolean add(E e) 尾插 e
        list.add("a");
        list.add("leng");
        System.out.println(list);
        // void add(int index, E element) 将 e 插入到 index 位置
        list.add(0,"wo");
        System.out.println(list);
        // boolean addAll(Collection<? extends E> c) 尾插 c 中的元素
        List<String> list1 = new ArrayList<>();
        list1. add("dudu");
        list.addAll(list1);
        System.out.println(list);
        // E remove(int index) 删除 index 位置元素
        list.remove(0);
        System.out.println(list);
        // boolean remove(Object o) 删除遇到的第一个 o
        list.add(2,"a");
        System.out.println(list);
        list.remove("a");
        System.out.println(list);
        // E get(int index) 获取下标 index 位置元素
        String str = list.get(0);
        System.out.println(str);
        // E set(int index, E element) 将下标 index 位置元素设置为 element
        list.set(1,"cheng");
        System.out.println(list);
        // boolean contains(Object o) 判断 o 是否在线性表中
        System.out.println(list.contains("ge"));
        // int indexOf(Object o) 返回第一个 o 所在下标
        int ret = list.indexOf("leng");
        System.out.println(ret);
        // int lastIndexOf(Object o) 返回最后一个 o 的下标
        list.add("leng");
        System.out.println(list);
        int req = list.lastIndexOf("leng");
        System.out.println(req);
        // List<E> subList(int fromIndex, int toIndex) 截取部分 lis
        List<String> result = list.subList(0,2);
        System.out.println(result);
        // void clear() 清空
        list.clear();
        System.out.println(list);
    }
}
