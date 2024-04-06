
class Solution {
    long mod = 1000000007;

    public long countWays(int n) {
        long[] res = new long[n + 1];
        res[0] = 1;
        res[1] = 1;
        for (int i = 2; i <= n; i++)
            res[i] = (res[i - 2] + 1) % mod;
        return res[n];
    }
}
