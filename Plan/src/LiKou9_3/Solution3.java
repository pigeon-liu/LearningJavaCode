package LiKou9_3;

public class Solution3 {
    /**
     * 给定一个链表，判断链表中是否有环。
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
