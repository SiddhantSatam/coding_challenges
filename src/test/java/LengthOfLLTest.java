import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLLTest {

    @Test
    public void lenOfLL() {
        LengthOfLL myLinkedlist = new LengthOfLL();
        myLinkedlist.addAtHead(5);
        myLinkedlist.addAtHead(6);
        myLinkedlist.addAtHead(7);
        myLinkedlist.addAtHead(1);
        myLinkedlist.addAtHead(2);

        assertEquals(6, myLinkedlist.lenOfLL());
        myLinkedlist.deleteAtIndex(2);
        assertEquals(5, myLinkedlist.lenOfLL());
    }
}