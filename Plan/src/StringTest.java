import java.awt.datatransfer.StringSelection;
import java.util.HashMap;
import java.util.Scanner;

public class StringTest {
    /**
     * 算法字符串中找出最长的数字串。
     */
    public void numLong(){
        Scanner scanner = new Scanner(System.in);
        String s =  scanner.nextLine();
        int count = 0;
        int max = 0;
        int end = 0;
        for (int i = 0;i<s.length();i++){
            if (s.charAt(i)>='0' && s.charAt(i) <= '9'){
                count ++;
                if (max < count){
                    max = count;
                    end = i;
                }
            }else {
                count = 0;
            }
        }
        System.out.println(s.substring(end-max+1,end+1));
    }

    public static void main(String[] args) {
        StringTest stringTest = new StringTest();
        stringTest.numLong();

    }
}

