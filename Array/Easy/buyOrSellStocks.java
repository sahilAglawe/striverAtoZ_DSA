class Solution {
    public int maxProfit(int[] prices) {
       int mini = prices[0];
       int maxProfit = 0;
       int n = prices.length;
       for(int i = 0; i<n; i++){
        int cost = prices[i] - mini;
        maxProfit = Math.max(maxProfit, cost);
        mini = Math.min(mini, prices[i]);
       }
       return maxProfit; 
    }
}

// T/c : O(N) , S/C : O(1)

// we firstly initialize the mini with the first element of the array and maxProfit with 0.
// then we iterate through the array and calculates the cost of buying and selling the stock at that point in time.
// we update the maxProfit if the cost is greater than the maxProfit and also update the mini if the current price is less than the mini.
// finally we return the maxProfit as the answer.
