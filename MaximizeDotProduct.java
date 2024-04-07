class Solution {

    public int maxDotProduct(int n, int m, int[] a, int[] b) {
        int[][] dp = new int[n - m + 1][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return f(a, b, n - m, 0, n, m, dp);
    }

    public int f(int[] a, int[] b, int z, int i, int n, int m, int[][] dp) {
        if (i == m) return 0;
        if (dp[z][i] != -1) return dp[z][i];
        int d = 0;
        if (z > 0) {
            d = f(a, b, z - 1, i, n, m, dp);
        }
        d = Math.max(d, a[i + n - m - z] * b[i] + f(a, b, z, i + 1, n, m, dp));
        dp[z][i] = d;
        return d;
    }
}
