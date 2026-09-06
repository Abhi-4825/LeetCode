class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
       
            if(i>0 && nums[i]==nums[i-1]) continue;
            
            int start=i+1;
            int last=nums.length-1;
          
            while(start<last){
                int sum=nums[i]+nums[start]+nums[last];
              if(sum==0){ list.add(Arrays.asList(nums[i],nums[start],nums[last]));
              while (start < last && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    while (start < last && nums[last] == nums[last - 1]) {
                        last--;
                    }
             start++;
             last--;
              }
              else if(sum<0) start++;
              else last--;
            }
          
        }
        return list;
    }
}