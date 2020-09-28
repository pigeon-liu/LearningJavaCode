package Niuke9_28;

public class Solution {
    /**
     * 第一天牛妹吃掉蛋糕总数三分之一（向下取整）多一个，第二天又将剩下的蛋糕吃掉三分之一（向下取整）多一个，以后每天吃掉前一天剩下的三分之一（向下取整）多一个，到第n天准备吃的时候只剩下一个蛋糕。
     * 牛妹想知道第一天开始吃的时候蛋糕一共有多少呢？
     * @param n int整型 只剩下一只蛋糕的时候是在第n天发生的．
     * @return int整型
     */
    public int cakeNumber (int n) {
        // write code here
        if(n <= 1){
            return 1;
        }
        int ret = 1;
        while(n > 1){
            ret = (ret+1) * 3 / 2;
            n--;
        }
        return ret;
    }
}
