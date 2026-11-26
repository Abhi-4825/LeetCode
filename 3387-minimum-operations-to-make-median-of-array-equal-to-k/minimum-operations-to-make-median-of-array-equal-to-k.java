class Solution {
    public long minOperationsToMakeMedianK(int[] nums, int k) {
        long ops=0;
        int[] a=nums.clone();
        int len=nums.length;
        Arrays.sort(a);
        int mid=len/2;
        if(a[mid]==k) return ops;
        for(int i =0;i<mid;i++){
            if(a[i]>k) ops+=(a[i]-k);
        }
        if(a[mid]!=k) ops+=Math.abs(a[mid]-k);
        for(int i=mid+1;i<len;i++){
            if(a[i]<k) ops+=(k-a[i]);
        }
        return ops;
        
    }
}