package org.artemrogov.sell_stock;

class Solution {
    public static int maxProfit(int[] prices) {
         int profit = 0;
         int indexBuy = 0;
         for (int i = 1; i<prices.length; i++){
             if (prices[indexBuy] > prices[i]){
                 indexBuy = i;
             }
             profit = Math.max(profit,prices[i] - prices[indexBuy]);
         }
         return profit;
    }
    public static int maxProfit2(int[] prices){
        int profit = 0;
        int indexBuy = Integer.MAX_VALUE;
        for (int price : prices) {
            indexBuy = Math.min(indexBuy, price);
            profit = Math.max(profit, price - indexBuy);
        }
        return profit;
    }
}
public class SellAppMain {
    public static void main(String[] args) {
        int[] solutionTestCase01 = new int[]{7,1,5,3,6,4};
        int[] solutionTestCase02 = new int[]{7,6,4,3,1};

        int result = Solution.maxProfit(solutionTestCase01);
        System.out.println(result);

        int resultTestCase2 = Solution.maxProfit(solutionTestCase02);
        System.out.println(resultTestCase2);

        //solution variant 2:

        int resultSolution2 = Solution.maxProfit2(solutionTestCase01);
        int resultSolutionTestCase2 = Solution.maxProfit2(solutionTestCase02);
        System.out.println(resultSolution2);
        System.out.println(resultSolutionTestCase2);
    }
}
