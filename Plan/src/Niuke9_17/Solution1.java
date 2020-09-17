package Niuke9_17;

import java.util.ArrayList;
import java.util.*;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
    this.val = val;
    }
 }

public class Solution1 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        /**
         * 层序遍历
         */
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur = root;
        queue.add(cur);
        while(cur != null && !queue.isEmpty()){
            TreeNode ret = queue.poll();
            list.add(ret.val);
            if(ret.left != null){
                queue.add(ret.left);
            }
            if(ret.right != null){
                queue.add(ret.right);
            }
            cur = queue.peek();
        }
        return list;
    }
}