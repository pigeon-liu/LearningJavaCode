package first.test;

import com.sun.xml.internal.ws.assembler.jaxws.TerminalTubeFactory;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;
import java.util.Scanner;

public class FirstDemo {
    /*
    * 输入一个字符串，将小写字母变成大写
    */
    public static void func1(String string) {
        System.out.println(string.toUpperCase());
    }

    /*
    * 输入一个整数，打印逆序整数
    */
    public static void func2(int a){
        while (a >= 10){
            int x = a%10;
            a = a/10;
            System.out.print(x);
            if (a < 10){
                System.out.println(a);
            }
        }
    }
    /*
    * 冒泡排序
    */
    public static void func3(int[] arr){
        for (int i =0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int tem = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tem;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    /*
     * 求两个数的最大公约数
     */
    public static void func4(int a,int b){

    }

    /*
    * 求两个数的最小公倍数
    * */
    public static void func5(int a, int b){

    }
    /*
    * 获取一个数二进制序列中所有偶数和奇数位，分别输出二进制序列
    * */

    /*猜数字游戏*/


    public static void main(String[] args) {
        int[] arr = {2,45,453,867,123,13};
        func3(arr);

    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        func2(m);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        func1(str);
    }
}
