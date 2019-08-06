/**
 * Given an integer, write a function to determine if it is a power of two.
 * <p>
 * Example 1:
 * <p>
 * Input: 1
 * Output: true
 * Explanation: 20 = 1
 * Example 2:
 * <p>
 * Input: 16
 * Output: true
 * Explanation: 24 = 16
 * Example 3:
 * <p>
 * Input: 218
 * Output: false
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {

        if (n <= 0)
            return false;
        if (n == 1)
            return true;

        String s = Integer.toBinaryString(n);
        char[] a = s.toCharArray();
        int count = 0;
        for (char ch : a) {
            if (ch == 1) {
                count = count + 1;
                if (count > 1) return false;
            }
        }
        return true;

    }

    public boolean isPowerOfTwo1(int n) {

        if (n <= 0)
            return false;
        if (n == 1)
            return true;

        return ((n & (n - 1)) == 0);//or  return ((n & (-n))==n)

    }
}