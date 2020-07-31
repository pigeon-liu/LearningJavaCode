import java.util.Stack;

class Node{
    public char val;
    public Node left;
    public Node right;
    public Node(char val){
        this.val = val;
    }
}
public class BinaryTree {
    public Node Buildtree(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');


        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;

        return A;
    }

    /*
     * 非递归遍历（一般用循环）
     * 依赖于栈
     */

    // 前序遍历
    public void preOrderTraversal(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.isEmpty()){
            while (cur != null){
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }
            Node top = stack.pop();
            cur = top.right;
        }
        System.out.println();

    }
    // 中序遍历
    void inOrderTraversal(Node root){
        if (root == null){
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            Node top = stack.pop();
            System.out.print(top.val + " ");
            cur = top.right;
        }
        System.out.println();
    }
    // 后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();
        Node cur = root;
        Node prev = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.peek();
            if (cur.right == null || cur.right == prev) {
                System.out.print(cur.val + " ");
                stack.pop();
                prev = cur;
                cur = null;
            } else {
                cur = cur.right;
            }
        }
        System.out.println();
    }

    //读入输入的一串先序遍历字符串，根据此字符串建立一个二叉树（以指针方式存储）。
    /*
    * 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是空格，空格字符代表空树。
    * 建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
    */
    int i = 0;
    public Node BuildTree(String str){
        Node root = null;
        if (str.charAt(i) != '#'){
            root = new Node(str.charAt(i));
            i++;
            root.left = BuildTree(str);
            root.right = BuildTree(str);
        } else {
            i++;
        }
        return root;
    }

    //二叉树两个指定节点的最近公共祖先
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null){
            return null;
        }

        if (p == root || q == root){
            return root;
        }

        Node left = lowestCommonAncestor(root.left,p,q);
        Node right = lowestCommonAncestor(root.right,p,q);

        if (left != null){
            if (right != null){
                return root;
            } else {
                return left;
            }
        } else {
            return right;
        }
    }

    // 二叉树搜索树转换成排序双向链表
    public Node prev = null;

    public void ConvertChild(Node pRoot) {
        //修改二叉树结构 --》 排好序的双向链表
        if (pRoot == null){
            return;
        }
        ConvertChild(pRoot.left);
        pRoot.left = prev;
        if (prev != null){
            prev.right = pRoot;
        }
        prev = pRoot;
        ConvertChild(pRoot.right);
    }

    public Node Convert(Node pRootOfTree) {
        if (pRootOfTree == null){
            return null;
        }
        Node head = pRootOfTree;
        ConvertChild(pRootOfTree);
        while (head.left != null){
            head = head.left;
        }
        return head;
    }


}
