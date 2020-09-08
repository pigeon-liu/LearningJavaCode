package Plan9_8;

public class Solution1 {
    public int Find(String str){
        int len = str.length();
        //判断字符串最后一个字符是否是空格，如果是直接返回零
        if (str.charAt(len-1) == ' '){
            return 0;
        }
        // 如果不是，以空格分割字符串，返回最后一个字符的长度
        String[] strings = str.split(" ");
        return strings[strings.length-1].length();
    }

    public static void main(String[] args) {
        Solution1 t = new Solution1();
        String string  = " ";
        System.out.println(t.Find(string));
    }
}
