package Test;

import java.util.HashMap;
import java.util.Map;

/**赋值带随机指针的链表
 *
 * 给定一个链表，每个节点包含一个额外增加的随机指针，该指针可以指向链表中的任何节点或空节点。
 * 要返回这个链表的深拷贝。
 */
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class Solution2 {
    public Node copyRandomList(Node head) {
        if (head == null){
            return head;
        }
        Node cur = head;
        Map<Node,Node> map = new HashMap<>();
        while (cur != null){
            Node node = new Node(cur.val);
            map.put(cur,node);
            cur = cur.next;
        }
        //新、老节点的映射关系已经全部处理完成
        cur = head;
        while (cur != null){
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }

        return map.get(head);
    }

    public static void main(String[] args) {

    }
}