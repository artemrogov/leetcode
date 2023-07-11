package org.artemrogov.array;

class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;

        int lastIndex = m + n - 1;
        while (j >= 0){
            if (i >= 0 && nums1[i] > nums2[j]){
                nums1[lastIndex] = nums1[i];
                i--;
            } else{
                nums1[lastIndex] = nums2[j];
                j--;
            }
            lastIndex--;
        }
    }
}
public class SolutionMergeTwoArray {
    public static void main(String[] args) {
    }
}
