class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int [] res=new int[nums.length];
       
        for(int k=0;k<res.length;k++){
            for(int i=res.length-1;i>index[k];i--){
                res[i]=res[i-1];
            }
           
            res[index[k]]=nums[k];

    }
    return res;
}}