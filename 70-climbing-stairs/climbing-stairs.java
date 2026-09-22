class Solution {
    public int climbStairs(int n) {
        if(n<2) return 1;
       int prev1=1;
       int prev2=1;
       int curr=prev1+prev2;
       for(int i=2;i<n;i++){
        
          prev1=prev2;
          prev2=curr;
          curr=prev1+prev2;
       }
       return curr;

    }
}