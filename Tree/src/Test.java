public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root1 = binaryTree.Buildtree();
        binaryTree.preOrderTraversal(root1);
        binaryTree.inOrderTraversal(root1);
        binaryTree.postOrderTraversal(root1);
        System.out.println("================");
        Node root2 = binaryTree.BuildTree("ABC##DE#G##F###");
        binaryTree.preOrderTraversal(root2);
        binaryTree.inOrderTraversal(root2);
        binaryTree.postOrderTraversal(root2);

    }
}
