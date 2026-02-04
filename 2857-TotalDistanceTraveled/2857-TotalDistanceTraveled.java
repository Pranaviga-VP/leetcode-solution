// Last updated: 2/4/2026, 4:35:11 PM
class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int consumedFuel = 0;
        int countFive = 0;
        while(mainTank > 0) {
            countFive++;
            if(countFive == 5) {
                countFive = 0;
                if(additionalTank > 0) {
                    mainTank++;
                    additionalTank--;
                }
            }
            consumedFuel++;
            mainTank--;
        }
        int ans = consumedFuel * 10;
        return ans;
    }
}