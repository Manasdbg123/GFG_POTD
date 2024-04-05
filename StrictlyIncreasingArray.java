// gfg potd april 5 2024 Strictly increasing array in java 

public class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int lis = 1;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (i - j <= nums[i] - nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            lis = Math.max(lis, dp[i]);
        }

        return n - lis;
    }
}





