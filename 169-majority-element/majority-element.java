class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> m =new HashMap<>();
        for(int num:nums){
            m.put(num,m.getOrDefault(num,0)+1);
        }
        int max=nums[0];
        for(int key:m.keySet()){
           if(m.get(max)<m.get(key))
            max=key;
        }
        return max;
    }
}