class Solution {
    public int maxProfit(int[] prices) {
        
      int n = prices.length;
      //int min  =0 ; int maxProfit = 0;
      if(n == 0 || n==1)
      return 0;
      
      int profit = prices[1] - prices[0];
      int min = prices[0] ;
      for(int i =1; i< n;i++)
      {
        profit = Math.max(profit, prices[i] - min);
        min = Math.min(min, prices[i]);
      }
      return (profit > 0)? profit : 0;
      
    }
}