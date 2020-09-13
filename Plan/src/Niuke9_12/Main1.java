package Niuke9_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main1{


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextInt();
        long b = scanner.nextInt();
         System.out.println(func(a,b));

    }
    public static long func(long n,long m){
        long count =0;
        long ret = 0;
        long num = 1;
        for (long i = 0;i<3;i++){
            for (long j = 0;j<n;j++){
                count = num * m;
                num++;
                ret = count + ret;
            }
        }
        return  ret;
    }

}