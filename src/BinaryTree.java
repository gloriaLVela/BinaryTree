
public class BinaryTree {

    public void delete(int value) {
        deleteLeaves(root, value);
//        root = deleteRecursive(root, value);
    }

    //
//    private Node deleteRecursive(Node current, int value) {
//        if (current == null) {
//            return null;
//        }
//        //Current node
//
//        if (value == current.key) {
//            System.out.println("value = " + value);
//            // Node to delete found
//            if (current.left == null && current.right == null) {
//                return null;
//            }
//            if (current.right == null) {
//                return current.left;
//            }
//
//            if (current.left == null) {
//                return current.right;
//            }
//
//            int smallestValue = findSmallestValue(current.right);
//            System.out.println("smallestValue = " + smallestValue);
//            current.key = smallestValue;
//            current.right = deleteRecursive(current.right, smallestValue);
//            return current;
//        }
//
//        if (current.right == null) {
//            System.out.println("right null value = " + value);
//            return current.left;
//        }
//
//        if (current.left == null) {
//            System.out.println("left null value = " + value);
//            return current.right;
//        }
//
//        if (value < current.key) {
//            current.left = deleteRecursive(current.left, value);
//            return current;
//        }
//        current.right = deleteRecursive(current.right, value);
//        return current;
//    }
//
//    private static int findSmallestValue(Node root) {
//        return root.left == null ? root.key : findSmallestValue(root.left);
//    }
    static Node deleteLeaves(Node root, int x) {
        if (root == null)
            return null;
        System.out.println("x = " + x);
        System.out.println("root.key = " + root.key);
        if (root.left != null) {
            System.out.println("root.left.key = " + root.left.key);
        }
        if (root.right != null) {
            System.out.println("root.right.key = " + root.right.key);
        }

        root.left = deleteLeaves(root.left, x);
        root.right = deleteLeaves(root.right, x);

//        if (root.key == x && root.left == null && root.right == null) {
//
//            return null;
//        }
        //Delete nodes
        if (root.key == x) {
            if (root.left == null && root.right == null) {
                return null;
            }
            if (root.left == null) {
                return root.right;
            }
            return root.left;

        }
        return root;
    }

    private static boolean containsNodeRecursive(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.key) {
            return true;
        }
        return value < current.key
                ? containsNodeRecursive(current.left, value)
                : containsNodeRecursive(current.right, value);
    }

    boolean nodeExists(int value) {
        return containsNodeRecursive(root, value);
    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.key) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.key) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }

        return current;
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    // Root of Binary Tree
    Node root;

    // Constructors
    BinaryTree(int key) {
        root = new Node(key);
    }

    BinaryTree() {
        root = null;
    }

}
