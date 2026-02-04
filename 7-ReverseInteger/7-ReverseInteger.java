// Last updated: 2/4/2026, 4:37:38 PM
class Solution {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        x *= sign;
        long ans = 0;
        while (x > 0) {
            ans = ans * 10 + x % 10;
            x /= 10;
        }
        ans *= sign;
        if (ans < -2147483648 || ans > 2147483647)
            return 0;
        else
            return (int) ans;
    }
}