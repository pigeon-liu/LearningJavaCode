package Niuke9_17;
import java.util.ArrayList;

/**
     * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
     */
public class Solution7 {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        if (pHead == null) {
            return pHead;
        }
        ArrayList<ListNode> list = new ArrayList<>();
        while (pHead != null) {
            list.add(pHead);
            if (list.contains(pHead.next)) {
                return pHead.next;
            }
            pHead = pHead.next;
        }
        return null;
    }
}


