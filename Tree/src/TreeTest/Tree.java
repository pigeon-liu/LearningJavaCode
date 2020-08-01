package TreeTest;


class Node{
    public int val;
    public Node left;
    public Node right;
    public Node(int val){
        this.val = val;
    }
}

public class Tree {

    //根据一棵树的前序遍历与中序遍历构造二叉树

    public int preIndex1 = 0;
    public Node buildTreeChild1(int[] preorder, int[] inorder, int inbegin, int inend) {
        //没有节点了
        if (inbegin > inend){
            return null;
        }
        Node root = new Node(preorder[preIndex1]);
        //找到当前根节点在中序遍历的位置
        int rootIndex = findIndexOfOrder1(inorder,inbegin,inend,preorder[preIndex1]);
        preIndex1++;
        if (rootIndex == -1){
            return null;
        }
        root.left = buildTreeChild1(preorder , inorder, inbegin, rootIndex-1);
        root.right = buildTreeChild1(preorder, inorder, rootIndex+1, inend);
        return root;
    }

    public int findIndexOfOrder1(int[] inorder,int inbegin,int inend,int val){
        for (int i = inbegin;i <= inend;i++){
            if (inorder[i] == val){
                return i;
            }
        }
        return -1;
    }

    public Node buildTree1(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null){
            return null;
        }
        if (preorder.length <=0 || inorder.length <=0){
            return null;
        }

        return buildTreeChild1(preorder, inorder,0,inorder.length-1);
    }

    //根据一棵树的中序遍历与后序遍历构造二叉树。

    public int postIndex = 0;
    public Node buildTreeChild(int[] inorder, int[] postorder, int inbegin, int inend) {
        if (inbegin > inend){
            return null;
        }
        Node root = new Node(inorder[postIndex]);
        int rootIndex = findIndexOfOrder(postorder,inbegin,inend,inorder[postIndex]);
        postIndex--;
        if (rootIndex == -1){
            return null;
        }
        root.right = buildTreeChild(inorder, postorder, rootIndex+1, inend);
        root.left = buildTreeChild(inorder , postorder, inbegin, rootIndex-1);

        return root;
    }

    public int findIndexOfOrder(int[] postorder,int inbegin,int inend,int val){
        for (int i = inbegin;i <= inend;i++){
            if (postorder[i] == val){
                return i;
            }
        }
        return -1;
    }

    public Node buildTree(int[] inorder, int[] postorder) {
        if (inorder == null || postorder == null){
            return null;
        }
        if (inorder.length <=0 || postorder.length <=0){
            return null;
        }
        postIndex = postorder.length-1;
        return buildTreeChild(inorder, postorder,0,inorder.length-1);
    }

    //采用前序遍历的方式，将一个二叉树转换成一个由括号和整数组成的字符串。
    public void tree2strChilid(Node t,StringBuffer sb) {
        if (t == null){
            return;
        }
        if (t.left == null){
            if (t.right == null){
                return;
            } else {
                sb.append("()");
            }
        } else {
            sb.append("(");
            tree2strChilid(t.left,sb);
            sb.append(")");
        }

        if (t.right == null){
            return;
        } else {
            sb.append("(");
            tree2strChilid(t.right,sb);
            sb.append(")");
        }
    }
}
