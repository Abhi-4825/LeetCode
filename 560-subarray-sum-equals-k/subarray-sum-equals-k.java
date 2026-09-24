class Solution {
    public int subarraySum(int[] nums, int k) {
      
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int count=0;
        for(int j=0;j<nums.length;j++ ){
            sum+=nums[j];
          int remaining = sum - k; 
            if(map.containsKey(remaining))
              count+=map.get(remaining);

            map.put(sum,map.getOrDefault(sum,0)+1) ; 


        }
        return count;
    }
}