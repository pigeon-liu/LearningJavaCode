package Niuke9_7;

class Node {
    int val;
    Node next;
    public Node(int val){
        this.val = val;
    }
}
public class Solution3 {
    /**
     *:首先,让小朋友们围成一个大圈。然后,他随机指定一个数m,让编号为0的小朋友开始报数。
     * 每次喊到m-1的那个小朋友要出列并且不再回到圈中,从他的下一个小朋友开始,继续0...m-1报数....这样下去....直到剩下最后一个小朋友
     *返回这个小朋友
     * 如果没有小朋友，返回-1
     * @param n
     * @param m
     * @return
     */
    public int LastRemaining_Solution(int n, int m) {
        if(n == 0 || m == 0){
            return -1;
        }
        Node head = new Node(0);
        Node cur = head;
        for(int i = 1;i<n;i++){
            Node node = new Node(i);
            head.next = node;
            head = node;
        }
        head.next = cur;
        while(cur.next.val != cur.val){
            int j = 0;
            while(j<m-2){
                cur = cur.next;
                j++;
            }
            cur.next = cur.next.next;
            cur =cur.next;
        }
        return cur.val;
    }

    public static void main(String[] args) {
        Solution3 t = new Solution3();
        System.out.println(t.LastRemaining_Solution(5, 3));
    }
}