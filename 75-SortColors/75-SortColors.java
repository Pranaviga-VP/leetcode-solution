// Last updated: 2/4/2026, 4:37:30 PM
class Solution {
    public void sortColors(int[] nums) {
        int ZI = 0,TI = nums.length-1,i=0;
        while(i<=TI){
            if(nums[i] == 0){
                int t = nums[i];
                nums[i++] = nums[ZI];
                nums[ZI++] = t;}
            else if(nums[i]==1) ++i;
            else{
                int t = nums[i];
                nums[i] = nums[TI];
                nums[TI--] = t;
            }
                }
                }
            }
