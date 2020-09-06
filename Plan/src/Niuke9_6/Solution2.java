package Niuke9_6;

public class Solution2 {
    /**
     * 题目描述
     * 例如，“student. a am I”。
     * 把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
     * @param str
     * @return
     */

    public String ReverseSentence(String str) {
        //判断如果str长度为0直接返回
        if(str.length() == 0){
            return str;
        }
        //判断 str 中全是空格，返回str
        int len = 0;
        while(len < str.length() && str.charAt(len)== ' '){
            len++;
        }
        if(len == str.length()){
            return str;
        }
        // 否则把str以空格分割放在数组中，倒序插入
        String[] string = str.split(" ");
        StringBuffer cur = new StringBuffer();
        for(int i = string.length-1;i>0;i--){
            cur = cur.append(string[i]);
            cur = cur.append(" ");
        }
        cur = cur.append(string[0]);
        String ret = new String(cur);
        return ret;
    }
    public static void main(String[] args) {
        Solution2 t = new Solution2();
        String str = "student. a i am";
        String string = t.ReverseSentence(str);
        System.out.println(string);
    }
}