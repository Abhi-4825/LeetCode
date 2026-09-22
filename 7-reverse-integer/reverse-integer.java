class Solution {
    public int reverse(int x) {
        boolean isNegative=x<0;
        int num=Math.abs(x);
        long ans=0;
        while(num>0){
           int last=num%10;
           num/=10;
           ans=ans*10+last;
        }
        if(isNegative) ans*=-1;
       
        return ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE ? 0: (int)ans;
    }
}