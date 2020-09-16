package Niuke9_15;

import java.util.Stack;

class Node{
    int val;
    Node left;
    Node right;
}
public class Solution5 {
    public void func(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur= root;
        while (cur != null || !stack.empty()){
            while (cur != null){
                stack.push(cur);
                System.out.print(cur.val+" ");
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }
}
