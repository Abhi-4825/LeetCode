class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res=new ArrayList<>();
      int max=Integer.MIN_VALUE;
      for(int num:candies){
        max=Math.max(num,max);
      }  
      for(int num:candies){
        if(num+extraCandies>=max)
          res.add(true);
        else
          res.add(false);  
      }
      return res;
    }
}