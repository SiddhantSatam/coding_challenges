import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AnagramTest {

    @Test
    public void isAnagramforTest() {
        Anagram anagram = new Anagram();
        assertTrue(anagram.isAnagram("saud", "saud"));
        assertTrue(anagram.isAnagram("saud", "ausd"));
        assertTrue(anagram.isAnagram("", ""));
        assertFalse(anagram.isAnagram("saud", "saude"));
        assertFalse(anagram.isAnagram("saud", "saue"));

    }

}
