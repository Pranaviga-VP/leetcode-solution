// Last updated: 2/4/2026, 4:36:45 PM
class Solution {
    public int minCostToMoveChips(int[] position) {
        int evenCount = 0;
        int oddCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        return Math.min(oddCount, evenCount);
    }
}