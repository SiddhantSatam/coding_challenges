/**
 * Reverse a singly linked list.
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 */

public class ReverseLinkedList extends LinkedList {

    public static void main(String[] args) {
        ReverseLinkedList myLinkedlist = new ReverseLinkedList();
        myLinkedlist.addAtHead(5);
        myLinkedlist.addAtHead(6);
        myLinkedlist.addAtHead(7);
        myLinkedlist.addAtHead(1);
        myLinkedlist.addAtHead(2);
        for (int i = 0; i < myLinkedlist.size; i++) {
            System.out.println(myLinkedlist.get(i));
        }
        myLinkedlist.head = myLinkedlist.getLastNode(myLinkedlist.head);
        System.out.println("After Reversed:");
        for (int i = 0; i < myLinkedlist.size; i++) {
            System.out.println(myLinkedlist.get(i));
        }

    }

    public Node getLastNode(Node head) {
        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {
            Node temp = currentNode.next;
            currentNode.next = prevNode;
            prevNode = currentNode;
            currentNode = temp;

        }

        return prevNode;

    }

}