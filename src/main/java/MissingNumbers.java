/**
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
 *
 * Example 1:
 *
 * Input: [3,0,1]
 * Output: 2
 */

public class MissingNumbers {
    public int missingNumber(int[] nums) {

        int xor =0, i=0;
        for (i=0; i<nums.length;i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}
