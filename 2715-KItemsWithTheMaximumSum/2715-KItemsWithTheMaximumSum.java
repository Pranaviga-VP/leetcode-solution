// Last updated: 2/4/2026, 4:35:31 PM
class Solution {
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        int result=0;
        if(k<=numOnes)
            return k;
        else
        {
            result=numOnes;
            k=k-numOnes;
            if(k<=numZeros)
                return result;
            else
            {
                k=k-numZeros;
                return result-k;
            }
        }
    }
}