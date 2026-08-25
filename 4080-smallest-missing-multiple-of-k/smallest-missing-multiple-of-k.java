class Solution {
    public int missingMultiple(int[] nums, int k) {
        boolean[] seen = new boolean[102]; // max value is 100
        for (int num : nums) {
            if (num % k == 0 && num / k <= 101) {
                seen[num / k] = true;
            }
        }
        
        int i = 1;
        while (seen[i]) {
            i++;
        }
        
        return i * k;
    }
}