class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
          int n=nums.length;
        int max=(int)Math.pow(2,n);
        Set<List<Integer>> s=new HashSet<>();
        for(int i=0;i<max;i++){
            int curr=i;
            List<Integer> row=new ArrayList<>();
            int j=0;
            while(curr>0){
               if((curr&1)==1) row.add(nums[j]);
               curr=curr>>1;
               j++;
            }
            s.add(row);
        }
        return new ArrayList<>(s);
    }
}