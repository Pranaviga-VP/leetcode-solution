// Last updated: 2/4/2026, 4:35:09 PM
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if (purchaseAmount % 10 > 4)
          purchaseAmount+= 10 - purchaseAmount % 10;
        else
          purchaseAmount-= purchaseAmount % 10;
        return 100 - purchaseAmount;
        }
}