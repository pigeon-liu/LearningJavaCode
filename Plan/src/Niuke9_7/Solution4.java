package Niuke9_7;

import java.util.ArrayList;

public class Solution4 {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        // 0. ru
        ArrayList<ArrayList<Integer> > retList = new ArrayList<>();
        if(sum == 0 || sum == 1 || sum == 2){
            return retList;
        }
        int len = sum/2+1;
        for(int i = 1;i<=len;i++){
            ArrayList<Integer> list = new ArrayList<>();
            int num = i;
            int ret = 0;
            int count = 0;
            while(ret != sum){
                ret = ret+num;
                num++;
                count++;
                if(num > len && ret >= len){
                    break;
                }
            }
            if(ret == sum){
                int tmp = i;
                for(int j = count;j>0;j--){
                    list.add(tmp);
                    tmp++;
                }
            }
            if(list.size()!= 0){
                retList.add(list);
            }
        }
        return retList;
    }

    public static void main(String[] args) {
        Solution4 t = new Solution4();
        System.out.println(t.FindContinuousSequence(15));
    }
}
