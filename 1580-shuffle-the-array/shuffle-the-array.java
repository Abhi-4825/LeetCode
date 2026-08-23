class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [ ]arr =new int[2*n];
       int i=0;
       int j=n;
    for(int k=0;k<n;k++){
      arr[2*k]=nums[i];
      arr[2*k+1]=nums[j];
      i++;
      j++;
    }
    return arr;
        
    }
}