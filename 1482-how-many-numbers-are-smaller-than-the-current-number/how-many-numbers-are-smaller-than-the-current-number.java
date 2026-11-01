class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
           int max=Integer.MIN_VALUE;
           for(int num:nums) max=Math.max(max,num);
           int [] count=new int[max+1];
           for(int num:nums) count[num]=count[num]+1;
           int s=0;
           for(int i=0;i<count.length;i++){
             int n=count[i];
             count[i]=s;
             s+=n;
           }
           int [] res=new int[nums.length];
           for(int i=0;i<res.length;i++){
            res[i]=count[nums[i]];
           }
           return res;

    }
}