class Solution {
    public int maxProfit(int[] prices) {
        int prev1=Integer.MAX_VALUE;
       
        int maxProfit=0;
      for(int num:prices){
          prev1=Math.min(prev1,num);
          if(prev1<num)
          maxProfit=Math.max(maxProfit,num-prev1);
      }  
      return maxProfit;
    }
}