class Solution {
    public int[] sumZero(int n) {
        int[] nums=new int [n];
     
        if(n==1)
        return nums;
        else{
             int number=1;
            for(int i=0;i<n/2;i++){
                nums[i]=number;
                nums[n-1-i]= -1*number;

                number++;
            }
        }
        return nums;
    }
}