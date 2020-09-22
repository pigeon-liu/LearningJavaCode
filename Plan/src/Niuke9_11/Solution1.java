package Niuke9_11;

class ListNode{
    int val;
    ListNode next;
    public ListNode(int val){
        this.val = val;
    }
}
public class Solution1 {
    public ListNode deleteDuplication(ListNode pHead){
        if(pHead == null ||pHead.next == null){
            return pHead;
        }

        while(pHead.val == pHead.next.val){
            pHead = pHead.next.next;
        }

        ListNode cur = pHead;
        ListNode root = pHead.next;

        while (root.next != null ) {
            if (root.val != root.next.val) {
                cur.next = root;
                cur  =  cur.next;
                root = root.next;
            } else {
                root = root.next.next;
            }
        }
        cur.next = root;

        /*while(pHead.val != pHead.next.val){
            pHead = pHead.next.next;
        }
        ListNode cur = pHead;
        ListNode root = cur;
        while(cur.next!= null){
            while (root.next.val != root.next.next.val && root.next != null){
                root.next = root.next.next.next;
            }
            root = root.next;
            cur = root;
        }*/
        return pHead;
    }

    public ListNode creat(){
        ListNode node1 = new ListNode('1');
        ListNode node2 = new ListNode('2');
        ListNode node3 = new ListNode('3');
        ListNode node4 = new ListNode('3');
        ListNode node5 = new ListNode('4');
        ListNode node6 = new ListNode('5');
        ListNode node7 = new ListNode('5');
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;
        return node1;
    }

    public void show(ListNode root){
        while (root != null){
            System.out.print(root.val + " ");
            root = root.next;
        }
    }


    public static void main(String[] args) {
        Solution1 t = new Solution1();
        ListNode phead = t.creat();
        t.show(phead);
        System.out.println();
        System.out.println("====================");
        t.deleteDuplication(phead);
        t.show(phead);
    }
}
