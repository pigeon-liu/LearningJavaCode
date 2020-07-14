package first.test;

import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstDemo {
    /*
    * 输入一个字符串，将小写字母变成大写
    */
    public static void func1() {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(str.toUpperCase());
    }

    /*
    * 输入一个整数，打印逆序整数
    */
    public static void func2(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int ret = 0;
        while (a >= 10){
            ret += (a%10);
            ret *= 10;
            a/=10;
        }
        ret+= a;
        System.out.println(ret);
    }
    /*
    * 冒泡排序
    */
    public static void func3(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for (int j =0;j<arr.length-1- i;j++){
                if (arr[j]>arr[j+1]){
                    int tem = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    /*
     * 求两个数的最大公约数
     */
    public static void func4(){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while (a % b != 0){
            if (a<b){
                int tem = a;
                a = b;
                b = tem;
            }
            int c = a % b;
            a = b;
            b = c;
        }
        System.out.println("最大公约数位"+b);
    }

    /*
    * 求两个数的最小公倍数
    * */
    public static void func5(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int ret = x*y;
        while (x % y != 0){
            if (x<y){
                int tem = x;
                x = y;
                y = tem;
            }
            int z = x % y;
            x = y;
            y = z;
        }
        int res = ret/y;
        System.out.println("最小公倍数为"+res);
    }
    /*
    * 获取一个数二进制序列中所有偶数和奇数位，分别输出二进制序列
    * */
    public static void func6(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print("奇数序列为:");
        for (int i = 30;i>=0;i-=2){
            System.out.print((num>>i)&1);
            System.out.print(" ");
        }
        System.out.println();
        System.out.print("偶数序列为:");
        for (int i = 31;i>=0;i-=2){
            System.out.print((num>>i)&1);
            System.out.print(" ");
        }
    }
    /*猜数字游戏*/
    public static void func7(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();        //根据当前系统的时间作为随机数种子，创建一个随机数生成器
        int num = random.nextInt(100);
        while (true){
            System.out.println("请输入你猜的数字:");
            int x = scanner.nextInt();
            if (x>num){
                System.out.println("你猜的数字大了！");
            } else if(x<num) {
                System.out.println("你猜的数字小了！");
            } else {
                System.out.println("恭喜你，猜对啦！");
                break;
            }
        }
    }

    public static void main(String[] args) {
        //func1();
        //func2();
        /*int[] arr = {23,768,123,45,232,53};
        func3(arr);*/
        func4();
        func5();
        //func6();
        //func7();
    }
}
