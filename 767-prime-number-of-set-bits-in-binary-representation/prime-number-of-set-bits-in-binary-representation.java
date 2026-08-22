class Solution {
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left;i<=right;i++){
            if(isPrime(getSetBit(i)) ) ans++;
        }
        return ans;
    }
    private int getSetBit(int num){
        int count=0;
        while(num>0){
            if((num&1)==1)
            count++;
            num>>=1;
        }
        return count;
    }
    private boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2)return true;
        if(num%2==0) return false;
        int root=(int)Math.sqrt(num); 
        for(int i=3;i<=root;i++){
            if(num%i==0) return false;
        }
        return true;
    }
}