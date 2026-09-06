class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int start=0;
        int end=start+k;
        double sum=0;
        for(int i=0;i<end;i++)sum+=(double)nums[i];
        double avg=sum/k;
        while(end<nums.length){
          sum+=nums[end];
          end++;
          sum-=nums[start];
          start++;
          avg=Math.max(avg,sum/k);
        }
        return avg;
    }
}