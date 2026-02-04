// Last updated: 2/4/2026, 4:35:37 PM
class Solution {
    public int alternateDigitSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            int value = Integer.parseInt(String.valueOf(s.charAt(i)));
            if (i % 2 != 0) {
                value = value * -1;
            }
            sum = sum + value;
        }

        return sum;
    }
}
    