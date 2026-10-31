class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] freq=new int[n+1];
        Arrays.fill(freq,1);
        for (int i=0;i<trust.length;i++){
             freq[trust[i][0]]=freq[trust[i][0]]-1;
             freq[trust[i][1]]=freq[trust[i][1]]+1;
        }
        int ans=-1;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==n) ans=i;
        }
        return ans;
    }
}