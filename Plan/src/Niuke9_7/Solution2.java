package Niuke9_7;

import java.util.ArrayList;

public class Solution2 {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<ArrayList<Integer>> retList = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        //遍历数组
        for(int i = 0;i<array.length;i++){
            ArrayList<Integer> list1 = new ArrayList<>();
            for(int j = i+1;j<array.length;j++){
                // 如果两数之和等于sum ，放进列表中
                if(array[i] + array[j] == sum){
                    list1.add(array[i]);
                    list1.add(array[j]);
                    int num = array[i] * array[j];
                    list2.add(num);
                }
            }
            if(list1.size()!= 0){
                retList.add(list1);
            }
        }
        // 如果没有和等于sum的数，直接返回空列表
        if(retList.size() == 0){
            return list2;
        }
        // 找出 list2 中乘积最小的返回对应的list1
        int count = 0;
        int ret = list2.get(0);
        for(int m = 0;m<list2.size();m++){
            if(ret > list2.get(m)){
                ret = list2.get(m);
                count = m;
            }
        }
        return retList.get(count);
    }

    public static void main(String[] args) {
        Solution2 t = new Solution2();
        int[] arr = {1,2,4,7,11,15};
        int n = 6;
        System.out.println(t.FindNumbersWithSum(arr, n));
    }
}