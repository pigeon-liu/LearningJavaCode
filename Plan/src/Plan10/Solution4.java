package Plan10;

import java.util.*;
//共有 k 个链表，计算每个链表倒数第 n 个数据值和。
public class Solution4 {
    // 找到每个链表倒数第 n 个数据并返回                                              
    public Integer sum(int n,List l){
        if(n > l.size() || n<=0){
            return 0;
        }
        for(int i = 0; i<l.size();i++){
            if(l.size() - i == n){
                String num =(String) l.get(i);
                if (num == null ||num.equals(" ") || num.length() == 0){
                    return 0;
                } else {
                    int res = Integer.parseInt(num);
                    return res;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args){
        Solution4 m = new Solution4();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (true){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            while (k >= 0){
                String str = scanner.nextLine();
                List<String> list = Arrays.asList(str.split(","));
                count = count + m.sum(n,list);
                k--;
            }
            break;
        }
        System.out.println(count);

    }
}