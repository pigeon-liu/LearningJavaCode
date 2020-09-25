package Test1;

import java.util.Scanner;

class Interval {
    int start;
    int end;
}
public class test1 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 返回Interval类，start代表汪仔最少做对了多少道题，end代表汪仔最多做对了多少道题。
     * @param n int整型 选择题总数
     * @param k int整型 朋友做对的题数
     * @param str1 string字符串 长度为n只包含ABCD的字符串，其中第i个代表汪仔第i题做出的选择
     * @param str2 string字符串 长度为n只包含ABCD的字符串，其中第i个代表朋友第i题做出的选择
     * @return Interval类
     */
    public Interval solve (int n, int k, String str1, String str2) {
        // write code here
        Interval interval = new Interval();
        if (k > n){
            return null;
        }
        if(str1.equals(str2)){
            interval.start = k;
            interval.end = k;

            return interval ;
        }
        int end = 0;
        int start = 0;
        for (int i = 0;i<str1.length();i++){
            if (k > 0) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    start++;
                    end ++;
                    k--;
                } else {
                    end++;
                }
            }else if (str1.charAt(i) != str2.charAt(i)){
                end++;
            }

        }
        while (k > 0){
            end--;
        }
        interval.start = start;
        interval.end = end;
        return interval;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        String str1 = scanner.next();
        String str2 = scanner.next();

        test1 t= new test1();
        Interval interval = t.solve(n, k, str1, str2);
        System.out.println(interval.start);
        System.out.println(interval.end);
    }
}