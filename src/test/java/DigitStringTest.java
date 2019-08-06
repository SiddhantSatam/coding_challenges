
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DigitStringTest {

    @Test
    public void isDigits() {
        DigitString isNumberInString = new DigitString();
        assertTrue(isNumberInString.isDigits("12345"));
        assertFalse(isNumberInString.isDigits("1234a5"));
        assertTrue(isNumberInString.isDigits(""));

    }
}
