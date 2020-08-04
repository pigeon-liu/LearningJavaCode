package Demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String ret = "";
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i<ch.length;i++){
            if (ch[i]>='0'&& ch[i]<='9'){
                count = 1;
                int index = i;
                for (int j = i+1; j<ch.length;j++){
                    if (ch[j]>='0'&& ch[j]<='9') {
                        count ++;
                        index = j;
                    }  else {
                        break;
                    }
                }
                if (count > ret.length()){
                    ret = str.substring(i,index+1);
                }

            } else {
                continue;
            }
        }
        System.out.println(ret);
    }
}
