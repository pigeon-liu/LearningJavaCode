package demo;

public class TestDemo {
    public static void main(String[] args) {
        SeqList seqList = new SeqList();
        seqList.add(0,1);
        seqList.add(1,4);
        seqList.add(2,8);
        seqList.add(3,6);
        seqList.add(4,9);
        seqList.add(5,3);
        seqList.display();
        System.out.println(seqList.contains(4));
        System.out.println(seqList.size());
        System.out.println(seqList.getPos(4));


    }
}
