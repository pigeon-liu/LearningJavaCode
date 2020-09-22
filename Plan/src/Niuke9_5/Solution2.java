package Niuke9_5;

public class Solution2 {
    public boolean isNStraightHand(int[] hand, int W) {
        if(hand.length == 0 && W >0){
            return false;
        }
        if(hand.length%W == 0){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,1};
        Solution2 t = new Solution2();
        System.out.println(t.isNStraightHand(arr, 2));
    }
}
