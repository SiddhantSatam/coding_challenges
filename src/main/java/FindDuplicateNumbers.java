/**
 * Given an array nums containing n + 1 integers where each integer is between 1 and n (inclusive),
 * prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 */

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateNumbers {
    public int findDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }

        return 0;
    }
}
