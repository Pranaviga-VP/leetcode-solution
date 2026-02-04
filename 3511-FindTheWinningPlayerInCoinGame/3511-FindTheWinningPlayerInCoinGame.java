// Last updated: 2/4/2026, 4:35:00 PM
class Solution {
    public String winningPlayer(int x, int y) {
        int t = Math.min(x, y / 4);
        return (t % 2 == 1) ? "Alice" : "Bob";
    }
}