package Niuke9_4;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Solution1 {
    /**
     * 输入一个链表，输出该链表中倒数第k个结点。
     * @param head
     * @param k
     * @return
     */
    public ListNode FindKthToTail(ListNode head,int k) {
        //如果头节点为空，直接返回
        if(head == null){
            return null;
        }
        //计算链表长度
        ListNode cur1 = head;
        int count = 0;
        while(cur1 != null){
            cur1 = cur1.next;
            count++;
        }
        //如果 k 的值大于链表长度，直接返回
        if(k>count){
            return null;
        }
        //反之循环链表到count-k的位置返回，就是倒数第k个节点
        for(int i = 0;i<count-k;i++){
            head = head.next;
        }
        return head;
    }
}