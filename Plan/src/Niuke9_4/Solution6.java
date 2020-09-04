package Niuke9_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Solution6 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > arraylist = new ArrayList<ArrayList<Integer>>();
        if(pRoot == null){
            return arraylist;
        }
        Queue<TreeNode> queue1 = new LinkedList<>();
        queue1.add(pRoot);
        Queue<TreeNode> queue2 = new LinkedList<>();
        while(!queue1.isEmpty() || !queue2.isEmpty()){
            if(!queue1.isEmpty()){
                ArrayList<Integer> list =  new ArrayList<Integer>();
                while(!queue1.isEmpty()){
                    TreeNode temp = queue1.poll();
                    list.add(temp.val);
                    queue2.add(temp);
                }
                arraylist.add(list);
            }
            while(!queue2.isEmpty()){
                TreeNode cur = queue2.poll();
                if(cur.left != null){
                    queue1.add(cur.left);
                }
                if(cur.right != null){
                    queue1.add(cur.right);
                }
            }
        }
        return arraylist;
    }
}
