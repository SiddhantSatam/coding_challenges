import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveElementTest {

    @Test
    public void removeElement() {

        RemoveElement removeElement = new RemoveElement();
        int size = removeElement.removeElement(new int[]{1, 2, 4, 4, 4}, 4);
        assertEquals(2, size);

    }

    @Test
    public void removeElementNull() {

        RemoveElement removeElement = new RemoveElement();
        int size = removeElement.removeElement(new int[]{4, 4}, 4);
        assertEquals(0, size);

    }

    @Test
    public void removeElementZero() {

        RemoveElement removeElement = new RemoveElement();
        int size = removeElement.removeElement(new int[]{}, 4);
        assertEquals(0, size);

    }
}