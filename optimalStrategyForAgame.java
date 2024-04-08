class Solution {
    public long solve(int i, int n, int[] arr, long[][] dp) {
        if (i > n)
            return 0;
        if (dp[i][n] != -1)
            return dp[i][n];
        long ans1 = arr[i] + Math.min(solve(i + 1, n - 1, arr, dp), solve(i + 2, n, arr, dp));
        long ans2 = arr[n] + Math.min(solve(i + 1, n - 1, arr, dp), solve(i, n - 2, arr, dp));
        return dp[i][n] = Math.max(ans1, ans2);
    }

    public long maximumAmount(int n, int[] arr) {
        long[][] dp = new long[n + 2][n + 2];
        for (int i = 0; i < n + 2; i++) {
            Arrays.fill(dp[i], -1);
        }
        return solve(0, n - 1, arr, dp);
    }
}
