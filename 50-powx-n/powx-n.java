class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long m=n;
        if(m<0){
            m=-m;
            x=1.0/x;
        }
        while(m>0){
            if((m&1)==1) ans=ans*x;
            x*=x;
            m=m>>1;
        }
      
        return ans;

    }
}