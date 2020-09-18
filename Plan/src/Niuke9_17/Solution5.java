package Niuke9_17;

public class Solution5 {
    /**
     * 求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）。
     * @param n
     * @return
     */
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n < 0){
            return 0;
        }
        int count = 0;
        while(n > 0){
            int num = n;
            while(num > 0){
                if(num % 10 == 1){
                    count++;
                }
                num = num / 10;
            }
            --n;
        }
        return count;
    }


    public static void main(String[] args) {
        Solution5 t = new Solution5();
        System.out.println(t.NumberOf1Between1AndN_Solution(11));
    }
}