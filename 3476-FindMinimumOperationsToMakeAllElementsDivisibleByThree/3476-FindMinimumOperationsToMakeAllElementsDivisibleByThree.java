// Last updated: 2/4/2026, 4:35:05 PM
class Solution {
    public int minimumOperations(int[] nums) {
    int n = 0;
    for(int i =0;i<nums.length;i++){
        if(nums[i]%3!=0){
            n++;
        }
    }
    return n;
    }
}