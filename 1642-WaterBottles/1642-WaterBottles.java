// Last updated: 2/4/2026, 4:36:36 PM
class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int drinked = 0;
        int eb = 0;
        while(numBottles > 0){
            drinked+=numBottles;
            eb+=numBottles;
            numBottles = eb / numExchange;
            eb = eb % numExchange;

        }
        return drinked;
    }
}