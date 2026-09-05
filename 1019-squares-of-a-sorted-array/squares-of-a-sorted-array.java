class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res=new int [nums.length];
       
        int j=0;
        for(int num:nums){
            if(num<0) j++;
        }
       int i=j-1;
        int k=0;
        while(i>=0 && j<nums.length){
            int sqi=nums[i]*nums[i];
            int sqj=nums[j]*nums[j];
            if(sqi<sqj) {res[k]=sqi;
            i--;}
            else {res[k]=sqj;
            j++;}
            k++;
        }
        while(i>=0){
             res[k]=nums[i]*nums[i];
            k++;
            i--;
        }
        while(j<nums.length){
            res[k]=nums[j]*nums[j];
            k++;
            j++;
        }
        return res;
    }
}