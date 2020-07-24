package Demo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("买牌");
        List<Card> decks =  CardDemo.buyDeck();
        System.out.println(decks);
        System.out.println("洗牌");
        CardDemo.shuffle(decks);
        System.out.println(decks);

        //三个人，每个人轮流抓 5 张牌
        List<List<Card>> hands = new ArrayList<>();
        List<Card> hand1 = new ArrayList<>();
        List<Card> hand2 = new ArrayList<>();
        List<Card> hand3 = new ArrayList<>();
        hands.add(hand1);
        hands.add(hand2);
        hands.add(hand3);
        for (int i = 0 ; i < 5 ; i++){
            for (int j = 0 ; j < 3 ; j++){
                Card delete = decks.remove(0);
                hands.get(j).add(delete);
            }
        }
        System.out.println("第一个人抓的牌");
        System.out.println(hand1);
        System.out.println("第二个人抓的牌");
        System.out.println(hand2);
        System.out.println("第三个人抓的牌");
        System.out.println(hand3);
    }
}
