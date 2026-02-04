// Last updated: 2/4/2026, 4:35:39 PM
class Solution {
    public int differenceOfSum(int[] nums) {
        int elemSum = 0;
        int digiSum = 0;
        int diff = 0;

        for(int i=0;i<nums.length;i++)
        {
            elemSum = elemSum + nums[i];
        }

        for(int i=0;i<nums.length;i++)
        {
            int num = nums[i];

            while(num>0)
            {
                int rem = num % 10;
                digiSum = digiSum + rem;
                num = num/10; 
            }
        }

        diff = Math.abs(elemSum - digiSum);
        return diff;
    }
}