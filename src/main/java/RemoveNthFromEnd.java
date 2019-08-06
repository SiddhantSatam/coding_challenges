
/**
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * Example:
 * Given linked list: 1->2->3->4->5, and n = 2.
 * After removing the second node from the end, the linked list becomes 1->2->3->5.
 */
public class RemoveNthFromEnd extends LinkedList {
    public static void main(String[] args) {
        RemoveNthFromEnd myLinkedlist = new RemoveNthFromEnd();
        myLinkedlist.addAtHead(5);
        myLinkedlist.addAtHead(6);
        myLinkedlist.addAtHead(7);
        myLinkedlist.addAtHead(1);
        myLinkedlist.addAtHead(2);
        for (int i = 0; i < myLinkedlist.size; i++) {
            System.out.println(myLinkedlist.get(i));
        }
        myLinkedlist.head = myLinkedlist.removeNthFromEnd(myLinkedlist.head, 2);
        System.out.println("After Removal:");
        for (int i = 0; i < myLinkedlist.size; i++) {
            System.out.println(myLinkedlist.get(i));
        }

    }

    public Node removeNthFromEnd(Node head, int n) {

        Node current = head;
        Node prev = null;
        Node after = null;

        int count = 0;

        while (current != null) {
            current = current.next;
            count++;

        }
        if (count == 1)
            return null;
        current = head;

        for (int i = 0; i < (count - n); i++) {
            prev = current;
            current = current.next;
            after = current.next;

        }
        if (current.next != null && prev != null)
            prev.next = current.next;

        return head;

    }
}