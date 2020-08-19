package BSearchTree;

import com.sun.org.apache.xerces.internal.dom.DeepNodeListImpl;
import jdk.nashorn.internal.ir.BaseNode;

public class TestDemo1 {
    class Node{
        public int val ;
        public Node left;
        public Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public Node root = null;

    public boolean insert(int val){
        Node node = new Node(val);
        if (root == null){
            root = node;
            return true;
        }
        Node cur = root;
        Node parent = null;
        while (cur != null) {
            if (cur.val == val){
                return false;
            } else if (cur.val > val) {
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }

        if (parent.val > val){
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;
    }

    //前序遍历
    public void proOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        proOrder(root.left);
        proOrder(root.right);
    }
    //中序遍历
    public void inOrder(Node root){
        if (root == null){
            return;
        }
        proOrder(root.left);
        System.out.print(root.val +" ");
        proOrder(root.right);
    }

    public Node search(int val){
        Node cur = root;
        while (cur != null){
            if (cur.val == val){
                return cur;
            } else if (cur.val > val){
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }

    public boolean remove(int key){
        Node cur = root;
        Node parent = null;
        while (cur != null){
            if (cur.val == key){
                removeNode(parent,cur);
                return true;
            }
            if (cur.val > key){
                parent = cur;
                cur = cur.left;
            } else {
                parent = cur;
                cur = cur.right;
            }
        }
        return false;
    }

    public void removeNode(Node parent,Node cur){
        if (cur.left == null){
            if (cur == root){
                root = cur.right;
            } else if (parent.left == cur){
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }
        } else if (cur.right == null){
            if (cur == root){
                root = cur.left;
            } else if (parent.left == cur){
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }
        } else {
            Node targetParent = cur;
            Node target = cur.right;
            while (target.left != null){
                targetParent = target;
                target = target.left;
            }
            cur.val = target.val;
            if (target == targetParent.left){
                targetParent.left = target.right;
            } else {
                targetParent.right = target.right;
            }
            //removeNode(targetParent,target);
        }
    }
    public static void main(String[] args) {
        TestDemo1 t1 = new TestDemo1();
        int[] arr = {12,8,2,10,30,20,16,49,60};
        for (int i:arr) {
            t1.insert(i);
        }
        t1.proOrder(t1.root);
        System.out.println();
        t1.inOrder(t1.root);
        System.out.println();

        //System.out.println(t1.search(20).val);

        System.out.println("=================");
        t1.remove(20);
        t1.proOrder(t1.root);
        System.out.println();
        t1.inOrder(t1.root);
        System.out.println();

    }
}
