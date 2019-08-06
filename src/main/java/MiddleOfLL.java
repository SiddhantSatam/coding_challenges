/**
 * Given a non-empty, singly linked list with head node head, return a middle node of linked list.
 * If there are two middle nodes, return the second middle node.
 */

public class MiddleOfLL extends LinkedList {

    public Node findMid(Node head) {
        Node tortoise = head;
        Node rabbit = head;

        while (rabbit != null && rabbit.next != null) {
            tortoise = tortoise.next;
            rabbit = rabbit.next.next;
        }

        return tortoise;

    }
}