package Plan_9_1;

import java.util.LinkedList;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;next = null;
    }
}

public class LinkedListTest {


    /**
     *  判断链表是否相交
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        while (headA != null){
            ListNode node = headB;
            while (node != null){
                if (headA == node){
                    return node;
                }
                node = node.next;
            }
            headA = headA.next;
        }
        return null;
    }



     /**
     *  判断链表是否带环
     */
     public boolean hasCycle(ListNode head) {
         if(head == null || head.next == null || head.next.next == null){
             return false;
         }
         ListNode cur1 = head;
         ListNode cur2 = head.next.next;

         while( cur2 != null && cur2.next != null){
             if(cur1 == cur2){
                 return true;
             }
             cur1 = cur1.next;
             cur2 = cur2.next.next;

         }
         return false;
     }


}
