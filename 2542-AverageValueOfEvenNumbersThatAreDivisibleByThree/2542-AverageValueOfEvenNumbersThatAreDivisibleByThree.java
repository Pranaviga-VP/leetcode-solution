// Last updated: 2/4/2026, 4:36:19 PM
class Solution {
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for(int x : nums) {
            if(x % 2 == 0) {
                if(x % 3 == 0) {
                    sum += x;
                    count++;
                }
            }
        }
       if (count == 0) {
        return 0;
       }
       return sum / count;
    }
}