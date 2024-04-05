// gfg april 4 potd 

public class Solution {
    public long sumSubstrings(String s) {
        final long mod = 1000000007;
        int n = s.length();
        long ans = 0;
        long prev = s.charAt(0) - '0';
        long next;
        ans += prev;
        for (int i = 1; i < n; i++) {
            next = (i + 1) * (s.charAt(i) - '0') + 10 * prev;
            next %= mod;
            ans += next;
            ans %= mod;
            prev = next;
        }
        return ans;
    }
}
