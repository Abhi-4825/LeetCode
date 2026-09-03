class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        int max=(int)Math.pow(2,n);
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<max;i++){
            int curr=i;
            List<Integer> row=new ArrayList<>();
            int j=0;
            while(curr>0){
               if((curr&1)==1) row.add(nums[j]);
               curr=curr>>1;
               j++;
            }
            l.add(row);
        }
        return l;
    }
}