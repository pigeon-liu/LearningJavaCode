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

    public Node buildTreeChild(int[] preorder, int preIndex, int[] inorder, int inbegin, int inend) {
        if (inbegin > inend){
            return null;
        }
        Node root = new Node(preorder[preIndex]);
        //找到当前根节点在中序遍历的位置
        int rootIndex = findIndexOfOrder(inorder,inbegin,inend,preorder[preIndex]);
        preIndex++;
        if (rootIndex == -1){
            return null;
        }
        root.left = buildTreeChild(preorder, preIndex, inorder, inbegin, rootIndex-1);
        root.right = buildTreeChild(preorder, preIndex, inorder, rootIndex+1, inend);
        return root;
    }

    public int findIndexOfOrder(int[] inorder,int inbegin,int inend,int val){
        for (int i = inbegin;i <= inend;i++){
            if (inorder[i] == val){
                return i;
            }
        }
        return -1;
    }

    public Node buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null){
            return null;
        }
        if (preorder.length <=0 || inorder.length <=0){
            return null;
        }

        int preIndex = 0;
        return buildTreeChild(preorder, preIndex, inorder,inbegin,inend);
    }
}
