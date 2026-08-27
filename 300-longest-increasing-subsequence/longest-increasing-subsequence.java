class Solution {
    public int lengthOfLIS(int[] nums) {
       List<Integer> l=new ArrayList<>();
       l.add(nums[0]);
       for(int i=1;i<nums.length;i++){
            if(nums[i] > l.get(l.size()-1))
             l.add(nums[i]);
            else{
               int index=findCeiling(l,nums[i]);
               l.set(index,nums[i]);
            } 
           
       }
        return l.size();
    }
    private int findCeiling(List<Integer> list,int k){
            int start=0;
            int end=list.size()-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(k==list.get(mid)) return mid;
                else if(k < list.get(mid)) end=mid-1;
                else start=mid+1;
            }
            return start;
    }
}