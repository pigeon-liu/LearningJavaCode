package Niuke9_15;

import javax.xml.soap.Node;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
public class Solution1 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root == null ){
            return true;
        }
        int right = TreeHigh(root.right);

        int left = TreeHigh(root.left);
        int ret = left - right;
        if(ret > 1 ||ret <-1){
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);
    }
    //二叉树的高度
    public int TreeHigh(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHigh = TreeHigh(root.left);
        int rightHigh = TreeHigh(root.right);
        return (leftHigh > rightHigh) ? leftHigh+1 : rightHigh+1;
    }
}
