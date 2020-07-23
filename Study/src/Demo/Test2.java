package Demo;

import java.util.Arrays;

public class Test2 {

    public static void main(String[] args) {
        String str = "WoDeAleng" ;
        // String 转 byte[]
        byte[] bytes = str.getBytes();
        for (int i = 0; i<bytes.length;i++){
            System.out.print(bytes[i]+" ");
        }
        System.out.println();
        // byte[] 转 String
        System.out.println(new String(bytes));

        //字节数组的部分内容转换字符串
        //value表示要转换的数组，3表示从下标为3的位置开始转换，5表示共转换5个字符
        String str2 = new String(bytes,4,5);  //Aleng
        System.out.println(str2);

        String string1 = "alengya";


        //将字符串变为字符数组返回
        byte[] bytes1 = string1.getBytes();
        System.out.println(Arrays.toString(bytes1));
        for (int i = 0;i<bytes1.length;i++){
            System.out.print(bytes1[i]+" ");
        }
        System.out.println();
    }

    public static void main1(String[] args) {
        //字符数组的所有内容转字符串
        char[] value = {'s','h','i','A','l','e','n','g','y','a'};
        String str1 = new String(value);
        System.out.println(str1);   //shiAlengya
        System.out.println(new String(value));


        //字符数组的部分内容转换字符串
        //value表示要转换的数组，3表示从下标为3的位置开始转换，5表示共转换5个字符
        String str2 = new String(value,3,5);  //Aleng
        System.out.println(str2);

        //获取指定位置的字符
        String string1 = "alengya";
        char ch = string1.charAt(1);  //读取指定位置的字符，下标从0开始
        System.out.println(ch);

        //将字符串变为字符数组返回
        char[] chars = string1.toCharArray();
        System.out.println(Arrays.toString(chars));
        for (int i = 0;i<chars.length;i++){
            System.out.print(chars[i]+" ");
        }
        System.out.println();

        // 判断字符串是否全由数字所组成
        String string = "Aleng21";
        System.out.println(isNum(string));
    }
    /*
     * 给定字符串一个字符串, 判断其是否全部由数字所组成.
     * 将一个字符串转换成字符数组，在判断每个字符是否是数字
     */
    public static boolean isNum(String str){
        char[] cha = str.toCharArray();
        for (int i = 0;i<cha.length;i++){
            if (cha[i]<'0'|| cha[i]>'9'){
                return false;
            }
        }
        return true;
    }
}


