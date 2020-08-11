package Demo;

import java.util.concurrent.Callable;

class Card{
    public int rank;
    public  String suit;
    public Card( int rank,String suit){
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        //如果obj是card的一个子类或实例化
        if (obj == null || !(obj instanceof Card)){
            return false;
        }

        Card tmp = (Card) obj;
        if (this.rank == tmp.rank && this.suit == tmp.suit){
            return true;
        }
        return false;
    }
}

public class TestDemo {
    public static void main(String[] args) {
        Card card1 =new Card(5,"♥");
        Card card2 =new Card(5,"♥");
        System.out.println(card1 == card2);
        System.out.println(card1.equals(card2));
        /*String str1 = new String("hello");
        String str2 = "hello";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));*/

    }
}
