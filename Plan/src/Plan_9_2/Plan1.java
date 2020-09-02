package Plan_9_2;

public class Plan1 {
    /**
     * 一个字符串里第一个只出现一次的字符
     */
    public char OneString(String str){
        int len = str.length();
        for (int i = 0;i<len;i++){
            char ch = str.charAt(i);
            int x = str.lastIndexOf(ch);
            int y = str.indexOf(ch);
            if (x == y){
                return str.charAt(x);
            }
        }
        return '#';
    }
    public static void main(String[] args) {
        String str = "google";
        Plan1 test = new Plan1();
        System.out.println(test.OneString(str));

    }


}
