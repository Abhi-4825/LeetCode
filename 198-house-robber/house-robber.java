class Solution {
    public int rob(int[] nums) {
        int [] dp=new int[nums.length];
        dp[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            int notPick=dp[i-1];
            int pick=nums[i];
            if(i>1)
             pick=nums[i]+dp[i-2];
            dp[i]=Math.max(pick,notPick); 
        }
        return dp[nums.length-1];
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