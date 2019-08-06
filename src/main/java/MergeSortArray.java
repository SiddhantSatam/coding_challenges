/**
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
 */

public class MergeSortArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int size = m + n - 1;
        int m_index = m - 1;
        int n_index = n - 1;
        while (size >= 0) {
            if (m_index < 0)
                nums1[size] = nums2[n_index--];
            else if (n_index < 0)

                nums1[size] = nums1[m_index--];
            else if (nums1[m_index] >= nums2[n_index])
                nums1[size] = nums1[m_index--];
            else
                nums1[size] = nums2[n_index--];
            size--;
        }
    }
}