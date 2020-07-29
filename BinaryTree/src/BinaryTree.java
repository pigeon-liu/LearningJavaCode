import com.sun.org.apache.xalan.internal.xsltc.dom.NodeSortRecord;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Node{
    public char value;   //数据域
    public Node left;   //左子树
    public Node right;  //右子树

    public Node(char value){
        this.value = value;
    }
}
public class BinaryTree {
    //List<Character> list = new ArrayList<>();
    public Node BuildTree(){
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
        //E.right = H;
        C.left = F;
        C.right = G;

        return A;
    }

    // 前序遍历   递归实现
    public void preOrderTraversal(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.value + " ");

        preOrderTraversal(root.left);
        preOrderTraversal(root.right);

    }
    //以链表的形式返回前序遍历
    public List<Character> preorderTraversal(Node root) {
        List<Character> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        list.add(root.value);
        List<Character> left = preorderTraversal(root.left);
        list.addAll(left);
        List<Character> right = preorderTraversal(root.right);
        list.addAll(right);
        return list;
    }
    // 中序遍历
    void inOrderTraversal(Node root){
        if (root ==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value + " ");
        inOrderTraversal(root.right);

    }

    //以链表的形式返回中序遍历

    /*public List<Character> inorderTraversal(Node root) {
        if (root == null){
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.value);
        inorderTraversal(root.right);
        return list;
    }*/


    // 后序遍历
    public void postOrderTraversal(Node root){
        if (root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    /*public List<Character> postorderTraversal(Node root) {
        if (root == null){
            return list;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.value);
        return list;
    }*/
    /*==============================================================================*/
    // 遍历思路-求结点个数
    static int size = 0;
    public int getSize1(Node root){
        if (root == null){
            return 0;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);

        return size;
    }
    // 子问题思路-求结点个数
    public int getSize2(Node root){
        if (root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) +1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    public int getLeafSize1(Node root){
        if (root == null){
            return -1;
        }
        if (root.left == null && root.right==null){
            leafSize++;
        } else {
            getLeafSize1(root.left);
            getLeafSize1(root.right);
        }
        return leafSize;
    }
    // 子问题思路-求叶子结点个数
    public int getLeafSize2(Node root){
        if (root == null){
            return -1;
        }
        if (root.left == null && root.right == null){
            return  1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);

    }

    // 子问题思路-求第 k 层结点个数
    public int getKLevelSize(Node root,int k){
        if (root == null){
            return 0;
        } else if (k == 1){
            return 1;
        }
        return getKLevelSize(root.left,k-1) + getKLevelSize(root.right,k-1);
    }

    // 获取二叉树的高度
    public int getHeight(Node root){
        if (root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? leftHeight+1 : rightHeight+ 1;
        //递归两次root.left和root.right，执行时间超出限制
        //return getHeight(root.left)>getHeight(root.right) ? getHeight(root.left)+1 : getHeight(root.right)+1;
    }
    
    //查找val所在节点
        /*
        *按照 根 -> 左子树 -> 右子树的顺序进行查找
        *没有找到返回 null， 一旦找到，立即返回，不需要继续在其他位置查找
        */
    Node find(Node root, char val){
        if (root == null){
            return null;
        }
        if (root.value == val){
            return root;
        }
        Node left = find(root.left,val);
       if (left != null){
           return left;
       }
       Node right = find(root.right,val);
       if (right != null){
           return right;
       }
       return null;
    }

    public Node BuildTree1(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        Node I = new Node('I');

        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        H.left = I;
        return A;
    }

    public Node BuildTree2(){
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        Node I = new Node('I');


        B.left = D;
        B.right = E;
        E.right = H;
        H.left = I;
        return B;
    }

    public Node BuildTree3(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');

        A.left = B;
        A.right = C;
        return A;
    }

    //判断两棵二叉树是否相同？<对应节点的值要相同，结构也要相同>
    public boolean isSameTree(Node p,Node q){
        if ((p == null && q != null ) || (p != null && q == null)){
            return false;
        }
        if (p == null && q == null){
            return true;
        }
        if (p.value != q.value){
            return false;
        }
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);

    }

    //判断二叉树t是否是s的子树
    public boolean isSubTree(Node s,Node t){
        if (s == null || t == null) {
            return false;
        }
        if (isSameTree(s,t)){
            return true;
        }
        return isSubTree(s.left,t) || isSubTree(s.right,t);
    }

    public Node BuildTree4(){
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        Node I = new Node('I');

        A.right = B;
        B.right = C;
        C.right = D;
        D.right = E;
        E.right = F;
        G.left = H;
        G.right = I;
        return A;
    }
    public Node BuildTree5(){
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        Node I = new Node('I');


        D.right = E;
        E.right = F;
        G.left = H;
        G.right = I;
        return D;
    }

    //判断平衡二叉树，左右子树高度差<2
        /*
        * 1、判断左右两树的高度差是否小于2；
        * 2、递归左树是否平衡
        * 3、递归右树是否平衡
        * 三点同时成立，该树平衡
        * */
    public boolean isBalanced(Node root){
        if (root == null){
            return true;
        }
        int leftHeiget = getHeight(root.left);
        int rightHeiget = getHeight(root.right);
        return Math.abs(leftHeiget-rightHeiget )<2 &&isBalanced(root.left) &&isBalanced(root.right);
    }

    //判断是否镜像二叉树
    public boolean isSymmetric(Node root) {
        if (root == null){
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }
    public boolean isSymmetricChild(Node leftTree,Node rightTree) {
        if ((leftTree!=null&&rightTree==null) || (leftTree==null&&rightTree!=null)){
            return false;
        }
        if (leftTree==null&&rightTree==null){
            return true;
        }
        if (leftTree.value == rightTree.value){
            return isSymmetricChild(leftTree.left,rightTree.right) && isSymmetricChild(leftTree.right,rightTree.left);
        }
        return false;
    }

    //层序遍历
    public void levelOrder(Node root){
        if (root == null){
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        //入队
        queue.offer(root);
        //判断队列是否为空
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            System.out.print(cur.value + " ");
            if (cur.left != null){
                queue.offer(cur.left);
            }
            if (cur.right != null){
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }

    //分层遍历，把每一层的数据放到list当中，再把list放到大的list当中
    public List<List<Character>> levelorder(Node root) {
        List<List<Character>> ret = new LinkedList<>();
        if (root == null){
            return ret;
        }
        Queue<Node> queue = new LinkedList<>();
        //入队
        queue.offer(root);
        //判断队列是否为空
        while (!queue.isEmpty()) {
            //每一次进入循环，相当于是每一层的数据
            //求当前队列长度  size
            int num = queue.size();
            List<Character> list = new LinkedList<>();
            //控制每一层个数
            while (num > 0) {
                Node cur = queue.poll();
                list.add(cur.value);
                if (cur != null){
                    if (cur.left != null){
                        queue.offer(cur.left);
                    }
                    if (cur.right != null){
                        queue.offer(cur.right);
                    }
                    num--;
                }
            }
            ret.add(list);
        }
        return ret;
    }

    //判断是否为完全二叉树
    public boolean isCompleteTree(Node root){
        if (root == null){
            return true;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur1 = queue.poll();
            if (cur1 != null){
                queue.offer(cur1.left);
                queue.offer(cur1.right);
            } else {
                break;
            }
        }

        while (!queue.isEmpty()){
            Node cur2 = queue.peek();
            if (cur2 != null) {
                return false;
            } else {
                queue.poll();
            }
        }
        return true;
    }
}
