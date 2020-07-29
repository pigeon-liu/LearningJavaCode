import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Test {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.BuildTree();
        System.out.println("=====遍历======");
        System.out.println(binaryTree.preorderTraversal(root));
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println("======求节点个数=======");
        System.out.println(binaryTree.getSize1(root));
        System.out.println(binaryTree.getSize2(root));
        System.out.println("======求叶子节点=======");
        System.out.println(binaryTree.getLeafSize1(root));
        System.out.println(binaryTree.getLeafSize2(root));
        System.out.println("======子问题思路-求第 k 层结点个数=======");
        System.out.println(binaryTree.getKLevelSize(root, 5));
        System.out.println(binaryTree.getHeight(root));
        System.out.println("============================");
        Node ret = binaryTree.find(root, 'E');
        System.out.println(ret.value);
        System.out.println("==============================");
        Node p = binaryTree.BuildTree1();
        Node q = binaryTree.BuildTree2();
        Node r = binaryTree.BuildTree3();
        System.out.println(binaryTree.isSameTree(p, q));
        System.out.println(binaryTree.isSameTree(p, r));
        System.out.println("====================");
        Node m = binaryTree.BuildTree4();
        Node n = binaryTree.BuildTree5();
        System.out.println(binaryTree.isSubTree(m, n));

    }
}
