import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BSTTest {

    @Test
    public void getSize() {
        BST.Node root = new BST.Node(5);
        root.left = new BST.Node(12);
        root.right = new BST.Node(25);
        root.left.left = new BST.Node(20);
        root.left.right = new BST.Node(30);
        root.right.left = new BST.Node(2);

        BST bst = new BST();

        assertEquals(6, bst.getSize(root
        ));
    }

    @Test
    public void getSize1() {

        BST bst1 = new BST();
        BST.Node root1 = new BST.Node(5);
        bst1.clear(root1);

        assertEquals(1, bst1.getSize(root1
        ));
    }
}