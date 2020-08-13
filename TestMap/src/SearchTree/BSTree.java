package SearchTree;


public class BSTree {
    public static class  Node{
        public int val;
        public Node left;
        public Node right;

        public Node(int val){
            this.val= val;
        }
    }

    public Node root;

    /**
     * 插入
     * @param val
     * @return
     */
    public boolean insert(int val){
        Node node = new Node(val);
        if (root == null){
            root = node;
            return true;
        }

        Node cur = root;
        Node parent = null;
        while (cur != null){
            if (cur.val == val){
                return false;
            }
            if (cur.val < val){
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }

        //cur为空，位置刚好，进行插入
        //两种情况
        if (parent.val > val){
            parent.left = node;
        } else {
            parent.right = node;
        }
        return true;
    }

    /**
     * 查找
     * @param val
     * @return
     */
    public Node search(int val){
        Node cur = root;
        while (cur != null){
            if (cur.val == val){
                return cur;
            }else if (cur.val > val){
                cur = cur.left;
            } else {
                cur = cur.right;
            }
        }
        return null;
    }

    /**
     * 删除
     * @param key
     * @return
     */
    public boolean remove(int key){
        Node cur = root;
        Node parent = null;
        while (cur != null){
            if (cur.val == key){
                removeNode(parent,cur);
                return true;
            } else if (cur.val > key){
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
            } else if(cur == parent.left){
                parent.left = cur.right;
            } else {
                parent.right = cur.right;
            }

        }  else if (cur.right == null){
            if (cur == root){
                root = cur.left;
            } else if(cur == parent.left){
                parent.left = cur.left;
            } else {
                parent.right = cur.left;
            }

        } else {
            Node targetParent = cur;
            Node target = cur.right;
            while (target.left != null){
                targetParent = target;
                target = targetParent.left;
            }
            cur.val = target.val;

            /*if (target == targetParent.left){
                targetParent.left = target.right;
            } else {
                targetParent.right = target.right;
            }*/
            removeNode(targetParent,target);
        }
    }



    /**
     *前序遍历
     * @param root
     */
    public void preOrder(Node root){
        if (root == null){
            return;
        }
        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    /**
     * 中序遍历
     * @param root
     */
    public void inOrder(Node root){
        if (root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.val + " ");
        inOrder(root.right);
    }
}
