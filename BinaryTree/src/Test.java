public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.BuildTree();
        System.out.println(binaryTree.preorderTraversal(root));
        System.out.println(binaryTree.getSize1(root));
        System.out.println(binaryTree.getSize2(root));
        System.out.println(binaryTree.getLeafSize1(root));
        System.out.println(binaryTree.getLeafSize2(root));
        System.out.println("======子问题思路-求第 k 层结点个数=======");
        System.out.println(binaryTree.getKLevelSize(root, 5));
        System.out.println(binaryTree.getHeight(root));
        System.out.println("============================");
        System.out.println(binaryTree.find(root, 'B'));
        /*System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);*/
    }
}
