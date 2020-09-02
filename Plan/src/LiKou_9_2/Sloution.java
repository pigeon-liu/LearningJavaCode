package LiKou_9_2;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class Sloution {
    /**
     * 反转一个单链表。
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head == null ||head.next == null){
            return head;
        }
        Stack<ListNode> stack = new Stack<>();
        ListNode cur = head;
        while(cur != null){
            stack.add(cur);
            cur = cur.next;
        }
        ListNode root = stack.pop();
        ListNode ret = root;
        while(!stack.isEmpty()){
            ret.next = stack.pop();
            ret = ret.next;

        }
        ret.next = null;
        return root;
    }
}
