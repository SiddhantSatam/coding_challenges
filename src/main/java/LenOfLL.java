/**
 * Find the length of linked list
 */

import java.util.LinkedList;

public class LengthOfLL extends LinkedList {

    public int lenOfLL() {
        Node tempNode = head;
        int count = 0;

        while (tempNode != null) {
            tempNode = tempNode.next;
            count++;
        }
        return count;
    }

}