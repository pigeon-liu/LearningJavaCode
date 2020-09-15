package Niuke9_15;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution4 {

//质数又称素数。一个大于1的自然数，除了1和它自身外，不能被其他自然数整除的数叫做质数，否则称为合数。
// 请将一个正整数分解质因数，如果输入的数不是合数，打印其本身，否则按照从小到大的属性打印出其质因子。

    /*请完成下面这个函数，实现题目要求的功能
    当然，你也可以不按照下面这个模板来作答，完全按照自己的想法来 ^-^
    ******************************开始写代码******************************/

    //请将一个正整数分解质因数，如果输入的数不是合数，打印其本身，否则按照从小到大的属性打印出其质因子。
    static int[] primeFactorization(int num) {
        Queue<Integer> queue = new LinkedList<>();
        if(num == 0 || num == 1){
            int[] arr = {num};
            return arr;
        }
        if (func(num)) {
            int[] arr = {num};
            return arr;
        }
        int i =2;
        //遍历判断
        while(i<num){
            //是合数
            if(num % i == 0){
                //将因子加入队列
                queue.add(i);
            }
            i++;
        }
        Queue<Integer> queue1 = new LinkedList<>();
        while (!queue.isEmpty()) {
            //判断质因子
            int tmp = queue.remove();
            if (func(tmp)){
                queue1.add(tmp);
            }
        }
        int len = queue1.size();
        int[] arr = new int[2*len];
        for (int j = 0;j<arr.length;j++){
            int ret = queue1.remove();
            arr[j] = ret;
            arr[j+1] = ret;
            j++;
        }
        return  arr;
    }


    //这个数是质数
    public static boolean func(int num){
        if (num == 0 || num == 1){
            return true;
        }
        int i =2;
        //遍历判断
        while(i<num){
            //是合数
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
    /******************************结束写代码******************************/


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] ret = primeFactorization(num);
        for (int i = 0;i<ret.length;i++){

            System.out.println(ret[i]);
        }
        /*
        int[] res;
        int _num;
        _num = Integer.parseInt(in.nextLine().trim());

        res = primeFactorization(_num);
        for(int res_i=0; res_i < res.length; res_i++) {
            System.out.println(String.valueOf(res[res_i]));
        }*/

    }
}
