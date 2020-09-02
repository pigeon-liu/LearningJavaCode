package LiKou_9_2;

import javax.xml.soap.Node;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val = val;
    }
}
public class Sloution2 {
    public int TreeDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        if(root.left == null && root.right == null){
            return 1;
        }
        if(root.left != null && root.right == null){
            return TreeDepth(root.left)+1;
        }
        if(root.left == null && root.right != null){
            return TreeDepth(root.right)+1;
        }
        int leftSize = TreeDepth(root.left)+1;
        int rightSize = TreeDepth(root.right)+1;
        if(leftSize >= rightSize){
            return leftSize;
        } else {
            return rightSize;
        }
    }
}
