package SearchTree;

public class Test {
    public static void main(String[] args) {
        BSTree bsTree = new BSTree();
        //int[] arr = {7,2,9,18,56,15,3};
        int[] arr = {12,8,2,10,30,20,16,49,60};
        for (int i:arr) {
            bsTree.insert(i);
        }

        bsTree.preOrder(bsTree.root);
        System.out.println();
        bsTree.inOrder(bsTree.root);
        System.out.println();

        //System.out.println(bsTree.search(9).val);


        System.out.println("=================");
        bsTree.remove(20);
        bsTree.preOrder(bsTree.root);
        System.out.println();
        bsTree.inOrder(bsTree.root);
        System.out.println();

    }
}
