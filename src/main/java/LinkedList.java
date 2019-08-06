/**
 * Linked List implementation
 */

public class LinkedList {

    public Node head;
    public int size;

    public LinkedList() {
        head = new Node(0);
        size = 0;
    }

    public int get(int index) {
        System.out.println(size);
        if (index < 0 || index >= size)
            return -1;

        Node cur = head.next;
        for (int i = 0; i < index; i++)
            cur = cur.next;
        return cur.data;
    }

    public void addAtHead(int val) {
        Node cur = new Node(val);
        cur.next = head.next;
        head.next = cur;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        Node cur = head.next;

        for (int i = 0; i < size - 1; i++)
            cur = cur.next;

        cur.next = node;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;

        Node node = new Node(val);
        Node pre = head;
        for (int i = 0; i < index; i++)
            pre = pre.next;

        node.next = pre.next;
        pre.next = node;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;

        Node pre = head;
        for (int i = 0; i < index; i++)
            pre = pre.next;

        pre.next = pre.next.next;
        size--;
    }

    public String toString() {

        StringBuilder res = new StringBuilder();

        Node cur = head.next;
        while (cur != null) {
            res.append(cur + "->");
            cur = cur.next;
        }
        res.append("Null");

        return res.toString();
    }

    public class Node {
        public int data;
        public Node next;

        public Node(int val) {
            this.data = val;
            this.next = null;
        }
    }
}