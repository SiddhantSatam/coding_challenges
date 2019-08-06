import java.util.HashMap;
import java.util.Map;

/**
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 *
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 *
 * Example:
 *
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 *
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 */

public class RemoveDupChar {

        public int removeDuplicates(int[] nums) {
            int i=0;
            for(int j=1;j<nums.length;j++) {
                if(nums[j]!=nums[i]) {
                    i++;
                    nums[i] = nums[j];
                }
            }
            return i+1;
        }

    /**
     * Find duplicate charachters in a String
     */
        public void findDuplicates(String usrInput) {
            char[] charArr = usrInput.toCharArray();
            Map<Character, Integer> hm = new HashMap<Character, Integer>();
            for (char ch: charArr) {
                if (hm.containsKey(ch)) {
                    hm.put(ch, hm.get(ch)+1);
                }
                else {
                    hm.put(ch, 1);
                }
            }
            for (Map.Entry<Character, Integer> entry = hm.entrySet()) {
                if (entry.getValue() > 1)
                    System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
}
