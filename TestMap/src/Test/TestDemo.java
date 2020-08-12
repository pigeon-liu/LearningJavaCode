package Test;

import java.beans.IntrospectionException;
import java.util.*;

public class TestDemo {

    /**
     * 大数据去重
     * 10W个数据当中，统计重复的数字及出现的次数
     * @param args
     */
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<10_0000;i++){
            list.add(random.nextInt(6000));
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        //key --> 关键字重复的数字；
        //value --> 重复数字出现的次数
        for (Integer key:list) {
            if (map.get(key) == null){
               map.put(key,1);
            } else {
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }

        for (Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey()+" 这个数字出现了"+entry.getValue()+"次");
        }
    }

    /**
     * 10W个数据当中，有重复的元素，请去掉重复的元素
     * @param args
     */
    public static void main2(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<10_0000;i++){
            list.add(random.nextInt(6000));
        }

        Set<Integer> set = new HashSet<>();
        set.addAll(list);

        System.out.println(set);
    }

    /**
     * 找出10W个数据当中，第一个重复的元素。
     * @param args
     */
    public static void main1(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0;i<10_0000;i++){
            list.add(random.nextInt(6000));
        }

        Set<Integer> set = new HashSet<>();
        /*for (int i = 0;i<list.size();i++){
            Integer val = list.get(i);
            if (set.contains(val)){
                System.out.println("第一个重复的元素:"+val);
                return;
            } else {
                set.add(val);
            }
        }*/

        for (Integer val : list) {
            if (set.contains(val)){
                System.out.println("第一个重复的元素:"+val);
                return;
            } else {
                set.add(val);
            }
        }

    }
}
