// 121 - Best Time to Buy and Sell Stock
// Time Complexity: O(n)
// Space Complexity: O(1)
class Solution {
    public int maxProfit(int[] prices) {
     int minPrice=prices[0];
     int totleProfit=0;
     for(int i=1;i<prices.length;i++){
        if(prices[i]<minPrice){
            minPrice=prices[i];
        }
        else{
             int profit=prices[i]-minPrice;
             totleProfit=Math.max(totleProfit,profit);
        }
     }
     return totleProfit;
    }
}
