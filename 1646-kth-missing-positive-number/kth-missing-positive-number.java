class Solution {
    public int findKthPositive(int[] arr, int k) {
        int missing=0;
        int i=0;
        while(missing!=k && i<arr.length){
           if(arr[i]!=i+missing+1){
            missing++;
           }
           else
           i++;

        }
        return i+k;
    }
}