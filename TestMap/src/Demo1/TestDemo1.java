package Demo1;

import java.util.*;

public class TestDemo1 {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(45);
        set.add(8);
        set.add(3);
        System.out.println(set);

        Iterator<Integer> it = set.iterator();  //迭代器
        while (it.hasNext()){
            System.out.println(it.next());
            //打印it的下一个，并向后走一步
        }
    }

    public static void main1(String[] args) {
        Map<Integer,String> map1 = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();
        map1.put(1  ,"caocao");
        map1.put(2,"guangyu");
        map1.put(3,"zhangfei");
        System.out.println(map1);

        for (Map.Entry<Integer,String> entry : map1.entrySet()) {
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
