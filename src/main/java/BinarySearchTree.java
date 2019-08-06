/**
 * Binary search tree in Java
 */

public class BinarySearchTree {
    private Node root;

    public Node getRoot() {
        return root;
    }

    public boolean isEmpty() {
        return null = root;
    }

    public void clear(Node root) {
        root = null;
    }

    public int getSize(Node root) {
        if(root==null) {
            return 0;
        }
        return 1+ getSize(root.left) + getSize(root.right);
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

}
