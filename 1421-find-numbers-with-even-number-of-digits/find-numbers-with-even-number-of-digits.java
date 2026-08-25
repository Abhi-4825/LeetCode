class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            int digits=(int)Math.log10(num)+1;
         if((digits&1)==0) count++;
        }
        return count;
    }
}