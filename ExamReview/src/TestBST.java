public class TestBST {
    public static void main(String[] args) {
        BST treeee = new BST();

        treeee.insert(3);
        treeee.insert(1);
        treeee.insert(5);
        treeee.insert(0);
        treeee.insert(2);
        treeee.insert(4);
        treeee.insert(6);

        treeee.displayInOrder();


        System.out.println("Min is: " + treeee.findMin());
        System.out.println("Max is: " + treeee.findMax());

       treeee.deleteKey(0);

        treeee.displayInOrder();

    }
}
