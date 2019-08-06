/**
 * Check if a string contains a digit
 * Return true, if it does.
 */
public class DigitString {

    public boolean isDigits(String s) {
        char[] charstr = s.toCharArray();
        for (char ch : charstr) {
            if ((ch <= 48) && (ch >= 57)) {
                return false;
            }

        }

        return true;
    }

}