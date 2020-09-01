package Niuke9_1;

import java.util.ArrayList;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;
    ListNode(int val) {
        this.val = val;
    }
}

public class Solution2 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while(listNode != null){
            stack.push(listNode.val);
        }
        while(!stack.empty()){
            Integer num = stack.pop();
            list.add(num);
        }
        return list;
    }
}
