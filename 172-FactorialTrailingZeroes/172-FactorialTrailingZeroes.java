// Last updated: 2/4/2026, 4:37:22 PM
class Solution {
    public int trailingZeroes(int n) {
        int cnt = 0;

        while (n > 0) {
            n /= 5;
            cnt += n;
        }

        return cnt;
    }
}