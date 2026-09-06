class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
       Arrays.sort(nums);
       List<List<Integer>> list=new ArrayList<>();
       for(int i=0;i<nums.length;i++){
        if(i!=0 && nums[i]==nums[i-1])continue;
        for(int j=i+1;j<nums.length;j++){
            if(j!=i+1 && nums[j]==nums[j-1]) continue;
            int start=j+1;
            int last=nums.length-1;
            long remaining=(long)target-(nums[i]+nums[j]);
            while(start<last){
                long sum= (long)(nums[start]+nums[last]);
                if(sum==remaining){
                   list.add(Arrays.asList(nums[i],nums[j],nums[start],nums[last]));
                   while(start<last &&  nums[start]==nums[start+1]) start++;
                    while(start<last &&  nums[last]==nums[last-1]) last--;
                   start++;
                   last--;
                }
                else if(sum<remaining) start++;
                else
                   last--;
            }

        }
       }
       return list;
    }
}