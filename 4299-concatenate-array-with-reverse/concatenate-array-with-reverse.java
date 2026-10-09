class Solution {
    public int[] concatWithReverse(int[] nums) {
        int size=nums.length;
        int[] ans=new int[2*size];
        for(int i=0;i<size;i++){
            ans[i]=nums[i];
        }
        reverse(0,size-1,nums);
        for(int i=size;i<2*size;i++){
            ans[i]=nums[i%size];
        }
        return ans;
    }
    private void reverse(int start, int last,int [] nums){
        if(start>last) return ;
        // swap
        int temp=nums[start];
        nums[start]=nums[last];
        nums[last]=temp;
        reverse(start+1,last-1,nums);
    }
}