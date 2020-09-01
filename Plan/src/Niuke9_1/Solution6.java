package Niuke9_1;

public class Solution6 {
    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
     * @param target
     * @return
     */
    public int JumpFloor(int target) {
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
     * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
     * @param target
     * @return
     */
    public int JumpFloorII(int target) {
        if(target == 0){
            return 0;
        }
        if(target == 1){
            return 1;
        }
        if(target == 2){
            return 2;
        }
        int num = 0;
        for(int i = 0;i<target;i++){
            num += JumpFloorII(i);
        }
        return num+1;
    }

    public static void main(String[] args) {
        int i0 =0;
        int i1 =1;
        int i2 =2;
        int i3 =3;
        int i4 =4;
        int i5 =5;
        int i6 =6;
        int i7 =7;
        int i8 =8;
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.JumpFloorII(i0));
        System.out.println(solution6.JumpFloorII(i1));
        System.out.println(solution6.JumpFloorII(i2));
        System.out.println(solution6.JumpFloorII(i3));
        System.out.println(solution6.JumpFloorII(i4));
        System.out.println(solution6.JumpFloorII(i5));
        System.out.println(solution6.JumpFloorII(i6));
        System.out.println(solution6.JumpFloorII(i7));
        System.out.println(solution6.JumpFloorII(i8));
    }
}