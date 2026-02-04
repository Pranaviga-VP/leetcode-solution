// Last updated: 2/4/2026, 4:35:08 PM
class Solution {
public:
    int differenceOfSums(int n, int m) {
    int sum = 0;
    int sum2 = 0;
    for(int i=0;i<=n;i++)
        if(i%m==0){
            sum=sum+i;
        }
        else{
            sum2 = sum2+i; 
        }
        int ans = sum2 - sum;
        return ans;
    }
};