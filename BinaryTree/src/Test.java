public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.BuildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
    }
}
