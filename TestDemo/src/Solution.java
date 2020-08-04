import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

class Node {
    public int val;
    public List<Node> children;

    public Node(int val) {
        this.val = val;
    }
    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }
}
 public class Solution {
    public List<Integer> postOrder(Node root) {
        List<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        Node tmp;
        while (!stack.empty()){
            tmp = stack.pop();
            list.add(root.val);
            for (Node node : root.children){
                stack.push(node);
            }
        }
        Collections.reverse(list);
        return list;
    }

     public static void main(String[] args) {

     }
 }