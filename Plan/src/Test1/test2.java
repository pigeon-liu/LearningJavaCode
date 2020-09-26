package Test1;

import java.util.Scanner;

public class test2 {

    //搬家公司正在帮助一家人将小物体装箱。一个箱子的大小是有限的，公司可以把一个箱子分成最多k个独立的隔间，
    // 将一个箱子分成r个隔间需要r-1个隔板（这一个箱子没有放隔板也拥有一个本身的隔间）。而这一次搬家工作只携带了b个隔板。
    //
    //在每一个隔间中，由于物件放多了容易损坏，最多只能放v个物体。现在这家人有a个物体，请问最少需要多少个箱子，才能将所有的物体装箱？
    /**
     * a：有a个物体
     * b：携带了b个隔板
     * k：一个箱子分成最多k个独立的隔间，
     * v：每一个隔间中，最多只能放v个物体。
     *输出：最少箱子数
     */

    public static int func( int a, int b,int k,int v ) {
        if (a == 0) {
            return 0;
        }
        if (a <= v) {
            return 1;
        }
        int count = 0;

        //k个独立隔间的箱子箱子数
        if (k <= 1) {
            while (a > 0) {
                count++;
                a = a - v;
            }
            return count;
        }
        int num1 = b / (k - 1);
        //剩余隔板数
        int num2 = b % (k - 1);
        //k个独立隔间的箱子箱子数共存放的物品数
        int num3 = num1 * k * v;
        count = num1;
        if (num3 >= a) {
            return count;
        } else {
            //剩余物品数量
            int n = a - num3;
            if (num2 == 0) {
                while (n > 0) {
                    count++;
                    n = n - v;
                }
                return count;
            } else {
                count++;
                int c = (num2 + 1) * v;
                n = n - c;
                while (n > 0) {
                    count++;
                    n = n - v;
                }
                return count;
            }

        }
    }
    /*public static int func( int a, int b,int k,int v ) {
        if (a == 0) {
            return 0;
        }
        if (a <= v) {
            return 1;
        }
        int count = 0;


        if (k <= 1){
            while (a > 0){
                count++;
                a = a -v;
            }
            return count;
        }
        //k个独立隔间的箱子箱子数
        int num1 = b / (k - 1);
        //剩余隔板数
        int num2 = b % (k - 1);
        //k个独立隔间的箱子箱子数共存放的物品数
        int num3 = num1 * k * v;
        while (num1 > 0){
            a = a -  k * v;
            count++;
            if (a <=0 ){
                return count;
            }
        }
        count = num1;
        //剩余物品数量
        int n = a - num3;
        if (num2 == 0) {
            while (n > 0) {
                count++;
                n = n - v;
            }
            return count;
        } else {
            count++;
            int c = (num2 + 1) * v;
            n = n - c;
            while (n > 0) {
                count++;
                n = n - v;
            }
            return count;
        }

    }*/

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            while (scan.hasNext()) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int k = scan.nextInt();
                int v = scan.nextInt();
                System.out.println(func(a, b, k, v));
            }


        }

    }