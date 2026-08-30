class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int minIndex=0;
        int maxIndex=0;
        for(int i=0;i<n;i++){
            if(max< nums[i]){
                max=nums[i];
                maxIndex=i;
            }
            if(min> nums[i]){
                min=nums[i];
                minIndex=i;
            }
        }
       int left=Math.min(maxIndex,minIndex);
       int right=Math.max(maxIndex,minIndex);
       
       // front
       int a1=right+1;
       //back
       int a2=n-left;
       // both from alternate
       int a3=(left+1) + (n-right);

        
       return Math.min(a1,Math.min(a2,a3));
    }
}