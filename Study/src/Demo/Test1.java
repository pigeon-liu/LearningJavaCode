package Demo;

public class Test1 {

    public static void main(String[] args) {
        String str1 = "Aleng";
        String str2 = "Aleng";
        String str3 = "Aleng";
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str2==str3);
        String string1 = new String("Acheng");
        String string2 = new String("Acheng");
        String string3 = new String("Acheng");
        System.out.println(string1==string2);
        System.out.println(string1==string3);
        System.out.println(string2==string3);
    }
    public static void main2(String[] args) {
        //字符串比较
        String str1 = null;
        String str2 = new String("Aleng");
        System.out.println(str1.equals(str2));
        System.out.println(str1==str2);
    }
    public static void main1(String[] args) {
        //创建字符串
        String str = "Hello";
        String str1 = str;
        str = "hi";
        String string = new String("hello");
        char[] array = {'h','i'};
        String string2 = new String(array);
        System.out.println("str = " + str);
        System.out.println("str1 = " + str1);
    }
}
