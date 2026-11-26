class Solution {
    public int minMoves2(int[] nums) {
        int len=nums.length;
        int[]a=nums.clone();
        Arrays.sort(a);
        int mid=a[len/2];
        int ops=0;
        for(int i=0;i<len;i++){
           ops+=Math.abs(a[i]-mid);
        }
        return ops;

    }
}