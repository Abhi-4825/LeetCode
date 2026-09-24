class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int cost=Integer.MAX_VALUE;
        for(int num:prices){
           cost=Math.min(num,cost);
           if(cost<num){
            max+=(num-cost);
            cost=num;
           }
        }
        return max;


    }
    
}