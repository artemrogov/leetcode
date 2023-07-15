package org.artemrogov.array;

import java.util.Arrays;

public class SolutionMergeTwoArray {
    public static void main(String[] args) {
        FunctionMergeArrays mergeArrays = (nums1, m, nums2, n) -> {
            int resultArraySize = m + n;
            int[] resultArray = new int[resultArraySize];
            System.arraycopy(nums1,0,resultArray,0,m);
            System.arraycopy(nums2,0,resultArray,m,n);
            System.out.println(Arrays.toString(resultArray));
        };

        int[] array01 = new int[]{1,2,3,4,5};
        int[] array02 = new int[]{6,7,8,9,10};

        int lengthArray01 = array01.length;
        int lengthArray02 = array02.length;

        mergeArrays.merge(array01,lengthArray01,array02,lengthArray02);
    }
}
