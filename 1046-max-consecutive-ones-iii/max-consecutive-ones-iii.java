class Solution {
    public int longestOnes(int[] nums, int k) {
        int sum=0;
        int ans=0;
        int i=0;
        for(int j=0;j<nums.length;j++){
            sum+=nums[j];
            while(sum+k<j-i+1){
                sum-=nums[i];
                i++;
            }
            ans=Math.max(ans,j-i+1);
        }
        return ans;
    }
}