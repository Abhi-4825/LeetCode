class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
              s.add(num);
        }
      
        int max=0;
        for(int num:s){
            if(!s.contains(num-1)){
                int current=num;
                int count=1;
                while(s.contains(current+1)){
                    current++;
                    count++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}