class Solution {
    public int rob(int[] nums) {

        int prev=0;
        int prev1=0;
      
        for(int i=0;i<nums.length;i++){
            int notPick=prev;
            int pick=nums[i]+prev1;
            int cost=Math.max(pick,notPick);
            prev1=prev;
            prev=cost;
          
        }
        return prev;
    }
    // memoization 
    private int rob(int[] nums,int index,int[] dp){
        if(index==0) return nums[0];
        if(index<0)return 0;
        if(dp[index]!=-1) return dp[index];
        int pick=nums[index] +rob(nums,index-2,dp);
        int notPick=rob(nums,index-1,dp);
        return dp[index]=Math.max(pick,notPick);
    }


}