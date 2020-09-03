package LiKou9_3;

public class Solution2 {
    /**
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        if(str == null){
            return null;
        }
        StringBuffer string = new StringBuffer();
        for(int i = 0 ;i<str.length();i++){
            if(str.charAt(i) == ' '){
                string.append("%20");
            } else {
                string.append(str.charAt(i));
            }
        }
        return string.toString();
    }

}
