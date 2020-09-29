package NiuKe9;

class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}
public class Solution1 {
    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            while(node.left != null){
                node = node.left;
            }
            return node;
        }
        TreeLinkNode node = pNode;
        if( node.next != null){
            if(node.next.left == node){
                return node.next;
            }
        } else {
            return null;
        }

        while(node.next != null && node.next.right == node ){
            node = node.next;
        }
        if(node.next == null){
            return null;
        } else{
            return node.next;
        }
    }
}