package Niuke9_17;

import java.util.*;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution4 {
    /**
     * 输入两个链表，找出它们的第一个公共结点。
     * @param pHead1
     * @param pHead2
     * @return
     */
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        if(pHead2 == null ||pHead1 == null){
            return null;
        }
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        ListNode cur = pHead1;
        while(cur != null){
            stack1.push(cur);
            cur = cur.next;
        }
        ListNode ret = pHead2;
        while(ret != null){
            stack2.push(ret);
            ret = ret.next;
        }
        ListNode end1 = null;
        ListNode end2 = null;
        ListNode end = null;
        while(!stack2.empty() && !stack1.empty()){
            end1 = stack1.pop();
            end2 = stack2.pop();
            if(end1 == end2){
                end = end1;;
                //return end1;
            } else {
                return end;
            }
        }
        if(stack1.empty()){
            return pHead1;
        } else {
            return pHead2;
        }
    }
}