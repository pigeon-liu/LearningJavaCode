package LiKou9_3;

import java.util.Stack;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}
public class Sloution1 {
    /**
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {

        Stack<ListNode> stack = new Stack<>();
        int len = 0;
        while(head != null){
            stack.push(head);
            head = head.next;
            len++;
        }
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = stack.pop().val;
        }
        return arr;
    }


}
