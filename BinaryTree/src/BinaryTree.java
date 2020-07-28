import com.sun.org.apache.xalan.internal.xsltc.dom.NodeSortRecord;

import java.util.ArrayList;
import java.util.List;

class Node{
    public char value;   //数据域
    public Node left;   //左子树
    public Node right;  //右子树

    public Node(char value){
        this.value = value;
    }
}
public class BinaryTree {
    List<Character> list = new ArrayList<>();
    public Node BuildTree(){
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

    public List<Character> inorderTraversal(Node root) {
        if (root == null){
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.value);
        inorderTraversal(root.right);
        return list;
    }


    // 后序遍历
    public void postOrderTraversal(Node root){
        if (root == null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value + " ");
    }

    public List<Character> postorderTraversal(Node root) {
        if (root == null){
            return list;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        list.add(root.value);
        return list;
    }
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
    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
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

}
