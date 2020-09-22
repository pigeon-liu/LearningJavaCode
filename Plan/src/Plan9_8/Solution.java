package Plan9_8;

public class Solution {
    public int StrToInt(String str) {
        if(str.length() == 0 ||str.equals(" ")){
            return 0;
        }
        //标志位，判断是正数 还是负数；
        boolean flg = true;
        //开始遍历的位置
        int i = 0;
        if(str.charAt(0) == '+' ||str.charAt(0) == '-' ){
            //如果第一个位置为正负号，则从下标为1 处开始索引
            i = 1;
            if(str.charAt(0) == '-'){
                flg = false;
            }
        }
        int sum = 0;
        for(;i<str.length();++i){
            // 0 的 ASCII码为 48, 9的ASCII码为57,
            if(str.charAt(i) < 48 || str.charAt(i) > 57){
                return 0;
            }
            sum = sum * 10 + (str.charAt(i) - 48);
        }
        sum = flg ? sum : sum * (-1);
        return sum;
    }
}