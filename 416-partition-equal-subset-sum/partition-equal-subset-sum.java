class Solution {
    public boolean canPartition(int[] nums) {

        int sum = 0;

        for (int num : nums) {
            sum += num;
        }

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        int n = nums.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        dp[0][0] = true;

        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <= target; j++) {

                // Don't take nums[i-1]
                dp[i][j] = dp[i - 1][j];

                // Take nums[i-1]
                if (j >= nums[i - 1]) {
                    dp[i][j] =
                        dp[i][j] ||
                        dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][target];
    }
}