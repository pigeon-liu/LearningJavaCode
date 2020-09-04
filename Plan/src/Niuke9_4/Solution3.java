package Niuke9_4;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}

public class Solution3 {
    /**
     * 请实现一个函数，用来判断一棵二叉树是不是对称的。
     * 如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
     * @param pRoot
     * @return
     */
    public boolean isSymmetrical(TreeNode pRoot){
        if(pRoot == null){
            return true;
        }
        if((pRoot.left == null && pRoot.right!= null) || (pRoot.left!= null && pRoot.right == null)){
            return false;
        }
        return isSymmetricalChild(pRoot.left,pRoot.right);
    }
    public boolean isSymmetricalChild(TreeNode leftTree,TreeNode rightTree){
        if(leftTree == null && rightTree == null){
            return true;
        }
        if((leftTree == null && rightTree != null) || (leftTree != null && rightTree == null)){
            return false;
        }
        if(leftTree.val != rightTree.val){
            return false;
        }
        return isSymmetricalChild(leftTree.left,rightTree.right) && isSymmetricalChild(leftTree.right,rightTree.left);
    }
}