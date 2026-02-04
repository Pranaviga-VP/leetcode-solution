// Last updated: 2/4/2026, 4:37:06 PM
class Solution {
    public boolean isPowerOfFour(int n) {
      if(n>1) while(n%4==0) n /= 4;
      return n==1;    
    }
}