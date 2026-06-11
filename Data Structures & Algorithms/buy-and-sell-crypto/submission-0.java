class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;
        int profit = 0;
        for(int i = 0; i < prices.length - 1; i++){
            if(prices[right] > prices[left]){
                profit = Math.max(profit, prices[right] - prices[left]);
            }
            else{left = right;}
            right++;
        }
        return profit;
    }
}