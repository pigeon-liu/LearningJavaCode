package Mate;

public class Test {
    public static void main(String[] args) {
        Vaild vaild = new Vaild();
        System.out.println(vaild.isvaild("(())"));
        System.out.println(vaild.isvaild("(([))"));
        System.out.println(vaild.isvaild("((())"));
        System.out.println(vaild.isvaild("([)]"));
        System.out.println(vaild.isvaild("{()}}"));

    }
}
