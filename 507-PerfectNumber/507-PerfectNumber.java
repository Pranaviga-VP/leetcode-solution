// Last updated: 2/4/2026, 4:36:55 PM
class Solution {
    public boolean checkPerfectNumber(int num) {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            sum=sum+i;
        }
        return sum==num;
    }
}