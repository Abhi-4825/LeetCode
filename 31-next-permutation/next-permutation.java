class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        if(n<2)return;
        int first=n-2;
        while(first>=0 && nums[first]>=nums[first+1]){
            first--;
        }
        if(first>=0){
            int second=n-1;
        while(nums[second]<=nums[first]){
            second--;
        }
        swap(nums,first,second);
       
        }
    
        reverse(nums,first+1);
        
        
        
    }
    private void reverse(int[] nums,int start ){
        int i=start;
        int j=nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    private void swap(int []nums,int a,int b){
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}