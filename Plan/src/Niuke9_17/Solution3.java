package Niuke9_17;

import java.util.*;
public class Solution3{
    public static void main(String[] args){
        char[][] chars = new char[7][4];
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        //高铁座位
        for(int i = 0; i < 7; ++i){
            chars[i][0] = 'A';
            chars[i][1] = 'B';
            chars[i][2] = 'C';
            chars[i][3] = 'D';
            count = count + 4;
        }
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        while(count > 0){

            if(a > 7 || b > 4){
                System.out.println("没有该位置，请重新选择");
            }
            else if(chars[a-1][b-1] == 'X'){
                System.out.println("该座位已被占用，请重新选座");
            }else {
                chars[a-1][b-1] = 'X';
                count--;
                System.out.println("您已成功选座");
            }
        }
    }
}