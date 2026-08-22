class Solution {
    public int binaryGap(int n) {
        int count = getBinaryCount(n);
        int[] arr=new int[count];
       int i=count-1;
        while(n>0){
        arr[i]=(n&1);
        n>>=1;
        i--;
        } 
        int left=-1;
        int ans=0;
        for(int j=0;j<count;j++){
            if(arr[j]==1){
                if(left!=-1)
                  ans=Math.max(ans,j-left);
                left=j;  
            }

        }

     
        return ans;
    }
    private int getBinaryCount(int n){
        int count= (int)(Math.log(n)/Math.log(2)) + 1;
        return count;
    }
}