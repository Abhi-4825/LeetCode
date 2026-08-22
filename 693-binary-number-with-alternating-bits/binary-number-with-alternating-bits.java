class Solution {
    public boolean hasAlternatingBits(int n) {
        int lsb=(n&1);
        while(n>0){
           int prev=lsb;
           n>>=1;
           lsb = (n&1);
           if(lsb==prev) return false;

        }
        return true;
    }
}