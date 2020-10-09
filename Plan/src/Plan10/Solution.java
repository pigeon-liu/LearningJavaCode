package Plan10;

public class Solution {
    /**
     * 从原始字符串中查找最长的“连续递增数字”子串，有多个长度一样的子串，
     * 则返回最后一个。
     * 比如：“12379abc2345sa3456ab789”返回“3456”
     * @param s
     * @return
     */
    public String func(String s){
        if(s == null || s.length() == 0 || s.equals(" ")){
            return null;
        }
        int num = 0;
        int n = 0;
        int i = 0;
        while (i < s.length()){
            int count = 0;
            int j = i;
            if(s.charAt(j)>'0' && s.charAt(j)<'9'){
                count++;
                char c = s.charAt(j);
                //j++;
                while( j+1 < s.length() && s.charAt(j+1) == c + 1 ){
                    c = s.charAt(j+1);
                    count++;
                    j++;
                }
            }
            if(count >= num){
                num = count;
                n = i; //记录开始位置
            }
            i = j+1;
        }
        String str = s. substring(n,n+num);
        return str;
    }

    public static void main(String[] args) {
        Solution t = new Solution();
        //String s = "12379abc2345sa456ab789";
        String s = null;
        System.out.println(t.func(s));
    }
}
