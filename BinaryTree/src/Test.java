public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.BuildTree();
        System.out.println(binaryTree.preorderTraversal(root));
        System.out.println(binaryTree.getSize1(root));
        System.out.println(binaryTree.getSize2(root));
        System.out.println(binaryTree.getLeafSize1(root));
        System.out.println(binaryTree.getLeafSize2(root));
        /*System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);*/
    }
}
