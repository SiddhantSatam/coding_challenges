/**
 * Remove the specified input element from the array.
 */

class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i<n) {
            if (nums[i] == val) {
                nums[i]=nums[n-1];
                //reduce the array size by one
                n--;
            } else
                i++;
        }
        return n;
    }
}