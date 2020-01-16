public class FindElement {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.add(8);
        tree.add(9);

        System.out.println("nodeExists(11) = " + tree.nodeExists(11));

        System.out.println("nodeExists(7) = " + tree.nodeExists(7));

        tree.delete(7);

        System.out.println("nodeExists(7) = " + tree.nodeExists(7));
    }
}
