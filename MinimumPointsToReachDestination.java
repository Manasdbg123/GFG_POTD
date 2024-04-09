class Solution {
    public int minPoints(int[][] points,int M,int N) {
        int[][] dp = new int[M][N];
        dp[M - 1][N - 1] = Math.max(1, 1 - points[M - 1][N - 1]);
        
        for (int i = M - 2; i >= 0; --i) {
            dp[i][N - 1] = Math.max(1, dp[i + 1][N - 1] - points[i][N - 1]);
        }
        
        for (int j = N - 2; j >= 0; --j) {
            dp[M - 1][j] = Math.max(1, dp[M - 1][j + 1] - points[M - 1][j]);
        }
        
        for (int i = M - 2; i >= 0; --i) {
            for (int j = N - 2; j >= 0; --j) {
                int minPointsRequired = Math.min(dp[i + 1][j], dp[i][j + 1]);
                dp[i][j] = Math.max(1, minPointsRequired - points[i][j]);
            }
        }
        
        return dp[0][0];
    }
}
