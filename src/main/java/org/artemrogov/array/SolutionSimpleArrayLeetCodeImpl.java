package org.artemrogov.array;

import java.util.Arrays;

public class SolutionSimpleArrayLeetCodeImpl implements ISolutionSimpleArrayLeetCode {
    @Override
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        int j = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                temp[j++] = nums[i];
            }
        }

        temp[j++] = nums[nums.length - 1];

        if (j >= 0) System.arraycopy(temp, 0, nums, 0, j);
        return j;
    }

    @Override
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) i++;
            else if (nums1[i] > nums2[j]) j++;
            else {
                nums1[k++] = nums1[i];
                ++i;
                ++j;
            }
        }
        int[] result = new int[k];
        for (i = 0; i < k; i++) {
            result[i] = nums1[i];
        }
        return result;
    }
}
