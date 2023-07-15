package org.artemrogov.sell_stock;

/**
 * Task 01: Best Time to Buy and Sell Stock
 * Task 02: Best Time to Buy and Sell Stock II
 * */
public class SellAppMain {
    public static void main(String[] args) {

        int[] solutionTestCase01 = new int[]{7,1,5,3,6,4};
        int[] solutionTestCase02 = new int[]{7,6,4,3,1};

        //task 01:
        FunctionSellStock sellStockOne = prices -> {
            int profit = 0;
            int indexBuy = Integer.MAX_VALUE;
            for (int price : prices) {
                indexBuy = Math.min(indexBuy, price);
                profit = Math.max(profit, price - indexBuy);
            }
            return profit;
        };

        System.out.println("Solution Sell Stock One(Task 01) Test Case 01: " + sellStockOne.maxProfit(solutionTestCase01));
        System.out.println("Solution Sell Stock One(Task 01) Test Case 02: " + sellStockOne.maxProfit(solutionTestCase02));

        int[] sTask02ValuesTestCase01 = new int[]{1,2,3,4,5};
        int[] sTask02ValuesTestCase02 = new int[]{7,6,4,3,1};

        // task 02:
        FunctionSellStock sellStockTwo = prices -> {
            int profit = 0;
            int oldPrices = prices[0];
            for (int i = 1; i<prices.length; i++){
                if (prices[i] >= oldPrices) {
                    profit += prices[i] - oldPrices;
                }
                oldPrices = prices[i];
            }
            return profit;
        };

        System.out.println("Solution Sell Stock Two(Task 02) Test Case 01: " + sellStockTwo.maxProfit(sTask02ValuesTestCase01));
        System.out.println("Solution Sell Stock Two(Task 02) Test Case 02: " + sellStockTwo.maxProfit(sTask02ValuesTestCase02));
    }
}
