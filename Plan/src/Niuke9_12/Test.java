package Niuke9_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static int add(int a,int b){
        return a+b;
    }
    public static void main1(String[] args){
        Scanner scanner =  new Scanner(System.in);
        while(scanner.hasNextInt()){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(add(a,b));
        }
    }

    /*public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int a = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0;i<a;i++){
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            list.add(x);
            list.add(y);
        }
        for (int i = 0;i<2*a;i++){
            int m =
            System.out.println(add(x,y));
        }

    }*/
}
