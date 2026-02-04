// Last updated: 2/4/2026, 4:37:12 PM
class Solution {
    public int addDigits(int num) {
     if (num == 0) return 0;
     else if (num % 9 != 0) return num % 9;
     else return 9;    
    }
}