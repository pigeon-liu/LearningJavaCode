package Niuke9_12;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int a = Integer.parseInt(scanner.nextLine());
            String string = scanner.nextLine();
            System.out.println(func(a,string));
        }

    }
    public static StringBuffer func(int n,String str){
        StringBuffer s = new StringBuffer();
        if (n<=1){
            s.append(s);
            return s;
        }
        char[] chars = str.toCharArray();
        int i = 0;
        while(i<chars.length){
            if (chars.length - i >= n){
                for(int j = i+n-1;j>=i;j--){
                    s.append(chars[j]);
                }
                i = i + n;
            } else {
                int num = chars.length - i -1;
                for (int j = i+num;j>=i;j--){
                    s.append(chars[j]);
                }
                break;
            }

        }
        return s;
    }
}
