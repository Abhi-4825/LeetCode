class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        int last=cardPoints.length-1;
        int max=sum;
        for(int i=k-1;i>=0;i--){
          sum-=cardPoints[i];
          sum+=cardPoints[last];
          last--;
          max=Math.max(sum,max);
        }
        return max;
    }
}