class Solution {
    public int[] productExceptSelf(int[] nums) {
     
        int leftProd=1;
        int rightProd=1;
        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            res[i]=leftProd;
            leftProd*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
                res[i]=res[i]*rightProd;
                rightProd*=nums[i];    
                
        }
        return res;

    }
}