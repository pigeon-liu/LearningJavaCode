package Niuke9_7;

import java.util.ArrayList;

public class Solution5 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        ArrayList<Integer> list = new ArrayList<>();
        // 遍历数组
        for(int i = 0;i<array.length;i++){
            int num = array[i];
            //判断链表中是否包含 array[i]；如果包含遍历列表删除。否则添加到链表
            if(list.contains(num)){
                for (int j = 0;j<list.size();j++){
                    if (list.get(j) == num){
                        list.remove(j);
                    }
                }
            } else{
                list.add(array[i]);
            }
        }
        num1[0] = list.get(0);
        num2[0] = list.get(1);
    }

    public static void main(String[] args) {
        Solution5 t = new Solution5();
        int[] arr = {2,4,3,6,3,2,5,5};
        int[] num1 = new int[1];
        int[] num2 = new int[1];
        t.FindNumsAppearOnce(arr,num1,num2);
        System.out.println(num1[0]);
        System.out.println(num2[0]);
    }
}
