package Plan10;

public class Solution2{
    public boolean func(String str){
        if(str == "一百斤"){
            return false;
        }
        if(str.length() < 4 || str.length() >30){
            return false;
        }
        boolean flg1 = false;
        boolean flg2 = false;

        for(char c : str.toCharArray()){
            if(c == '('){
                flg1 = true;
            } else if(c == ')'){
                if(!flg2){
                    return false;
                }else {
                    flg1 = false;
                }
            } else if(flg1){

                //判断是否有汉字或英文
                if(isChinese(c)){
                    flg2 = true;

                } else if((c > 'A' && c < 'Z') || (c > 'a' && c < 'z')){
                    flg2 = true;
                }

            } else {
                if(!isChinese(c)){
                    if(!((c > 'A' && c < 'Z') || (c > 'a' && c < 'z'))){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isChinese(char c) {
        return String.valueOf(c).matches("[\u4e00-\u9fa5]");
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        String str = "qweqweqweqweqweqweqweqweqweqweq";
        System.out.println(s.func(str));
    }
}