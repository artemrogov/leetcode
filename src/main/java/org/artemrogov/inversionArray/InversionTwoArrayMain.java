package org.artemrogov.inversionArray;

import java.util.Arrays;

class Solution {
    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j]) i++;
            else if(nums1[i]>nums2[j]) j++;
            else{
                nums1[k++]=nums1[i];
                ++i;++j;
            }
        }
        int[] result =new int[k];
        for(i=0;i<k;i++){
            result[i]=nums1[i];
        }
        return result;
    }
}
public class InversionTwoArrayMain {
    public static void main(String[] args) {

      int[] solutionOutputTestCase01 = new int[]{2,2};

      int[] numTest01 = new int[]{1,2,2,1};
      int[] numTest02 = new int[]{2,2};

      int[] resultTestCase = Solution.intersect(numTest01,numTest02);

      System.out.println("Output "+ Arrays.toString(solutionOutputTestCase01) +Arrays.equals(resultTestCase,solutionOutputTestCase01));
    }
}
