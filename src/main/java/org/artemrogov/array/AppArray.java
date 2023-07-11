package org.artemrogov.array;

import java.util.Arrays;

public class AppArray {
    public static void main(String[] args) {
        ISolutionSimpleArrayLeetCode solutionService = new SolutionSimpleArrayLeetCodeImpl();
        int[] solutionOutputTestCase01 = new int[]{2,2};
        int[] numTest01 = new int[]{1,2,2,1};
        int[] numTest02 = new int[]{2,2};
        int[] resultTestCase = solutionService.intersect(numTest01,numTest02);
        System.out.println("Output "+ Arrays.toString(solutionOutputTestCase01)
                +Arrays.equals(resultTestCase,solutionOutputTestCase01)
        );
        //////////////////////////// Array remove dublicates:
        int[] dublicatesArr = new int[]{1,1,2};

        int result = solutionService.removeDuplicates(dublicatesArr);

        System.out.println("output: " + result);
    }
}
