package Niuke9_11;

public class Solution3 {
    public double Power(double base, int exponent) {
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }
        //递归
        if (exponent > 0){
            return base*Power(base,exponent-1);
        } else {
            return 1/base*Power(base,exponent+1);
        }
    }

    public double Power2(double base, int exponent) {
        if(exponent == 0){
            return 1;
        }
        if(exponent == 1){
            return base;
        }
        // 逐次乘
        double ret = 1;
        if (exponent > 0) {
            while (exponent > 0) {
                ret = ret * base;
                exponent--;
            }
        } else {
            while (exponent < 0){
                ret = ret * (1/base);
                exponent++;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution3 t = new Solution3();
        System.out.println(t.Power(2, -3));
        System.out.println(t.Power2(2, -3));
    }
}
