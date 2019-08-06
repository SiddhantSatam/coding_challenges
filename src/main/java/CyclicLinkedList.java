import java.util.HashMap;
import java.util.Map;

/**
 * Given a linked list, determine if it has a cycle in it.
 *
 * To represent a cycle in the given linked list, we use an integer pos which represents the position (0-indexed) in the linked list where tail connects to. If pos is -1, then there is no cycle in the linked list.
 */

public class CyclicLinkedList extends LinkedList {
    public boolean hasCycle(Node head) {
        Node curr = head;
        int i = 1;
        Map<Node, Integer> map = new HashMap<Node, Integer>(); // using HashSet was more appropriate though
        if (curr == null)
            return false;
        else
            map.put(curr, 0);

        while (curr.next != null) {
            if (!map.containsKey(curr.next)) {
                map.put(curr.next, i);
                i++;
                curr = curr.next;
            } else {
                return true;
            }
        }

        return false;

    }
}