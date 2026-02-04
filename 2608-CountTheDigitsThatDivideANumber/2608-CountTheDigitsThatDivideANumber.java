// Last updated: 2/4/2026, 4:35:42 PM
class Solution {
    public int countDigits(int num) {
        int n = num , sol = 0;
        while(n>0){
            if(num % (n%10)==0){
                sol++;
            }
            n/=10;
        }
        return sol;
    }
}