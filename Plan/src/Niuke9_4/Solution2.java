package Niuke9_4;

public class Solution2 {
    /**
     * 输入两个单调递增的链表，输出两个链表合成后的链表，
     * 合成后的链表满足单调不减规则。
     * @param list1
     * @param list2
     * @return
     */
    public ListNode Merge(ListNode list1, ListNode list2) {
        // 如果 list1 为空，直接返回 list2
        if (list1 == null) {
            return list2;
        }
        // 如果list2 为空，直接返回 list1
        if (list2 == null) {
            return list1;
        }
        ListNode head = null;
        // list1 和 list2 都不为空 记录头结点
        if (list1.val <= list2.val) {
            head = list1;
            list1 = list1.next;
        } else {
            head = list2;
            list2 = list2.next;
        }
        // 循环建立新链表，到两个链表都为空
        ListNode cur = head;
        while (list1 != null && list2 != null) {
            if (list1.val >= list2.val) {
                cur.next = list2;
                list2 = list2.next;
                cur = cur.next;
            } else {
                cur.next = list1;
                list1 = list1.next;
                cur = cur.next;
            }
        }
        if (list1 != null) {
            cur.next = list1;
            list1 = list1.next;
        }
        if (list2 != null) {
            cur.next = list2;
            list2 = list2.next;
        }
        return head;
    }
}

