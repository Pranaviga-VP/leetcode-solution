// Last updated: 2/4/2026, 4:37:15 PM
class Solution {
    public boolean isPowerOfTwo(int n) {
        return n>0 &&(n &(n-1)) == 0;
    }
}