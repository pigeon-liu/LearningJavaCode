package demo;

public class Test {
    public static void main(String[] args) {
        MyList myList = new MyList();
        myList.addFirst(7);
        myList.addFirst(4);
        myList.addFirst(2);
        myList.addFirst(23);
        myList.addFirst(8);
        myList.addFirst(4);
        myList.addFirst(12);
        myList.addLast(34);
        myList.display();
        //System.out.println(myList.size());
        myList.remove(4);
        myList.display();
        myList.removeAllKey(4);
        myList.display();
        System.out.println(myList.contains(12));
        myList.addIndex(1,2);
        myList.display();
        System.out.println("=================");
        myList.clear();
        myList.display();
        System.out.println("=================");
    }


}
