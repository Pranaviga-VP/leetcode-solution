// Last updated: 2/4/2026, 4:36:42 PM
class Solution {
    public int subtractProductAndSum(int n) {
        int mul = 1;
        int sum = 0;
        while (n != 0) {
         int mod = n %10;
         sum += mod;
         mul *= mod;
         n /= 10;
        }

        return mul - sum;
    }
}