package Niuke9_15;

import java.util.ArrayList;

public class Solution3 {
    public static boolean IsPopOrder(int [] pushA,int [] popA) {
        ArrayList<Integer> list = new ArrayList<>();
        int i= 0;
        int j = 0;
        //遍历
        while(i<popA.length){
            //while(j<pushA.length-1){
                // 找到出栈数组的第一个元素在入栈数组的位置，
                while(popA[i] != pushA[j]){
                    list.add(pushA[j]);
                    j++;
                }
                i++;   //1
                ++j;   //4
            //}
            // 判断下一个出栈的元素是否登入已经入栈的最后一个元素
            if(list.get(list.size()-1) == popA[i]){
                list.remove(list.size()-1);
                i++;
            }
            //判断下一个入栈元素是否等于出栈元素
             else  if (pushA[j] == popA[i]){
                //list.remove(list.size()-1);
                i++;
                j++;
             } else {
                 return false;
            }
        }
        if (list.isEmpty()){
            return true;
    } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int [] pushA = {1,2,3,4,5};
        int [] popA = {4,3,5,2,1};
        System.out.println(IsPopOrder(pushA, popA));
    }
}