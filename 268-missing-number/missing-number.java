class Solution {
    public int missingNumber(int[] nums) {
        Set <Integer> s=new HashSet<>();
        for(int num:nums) s.add(num);
        int res=0;
        for(int i=0;i<=nums.length;i++){
          if(!s.contains(i)){res=i;
          break;}
        }
        return res;
    }
}