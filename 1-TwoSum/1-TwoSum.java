// Last updated: 2/4/2026, 4:37:39 PM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }    
        return new int[]{};
    }
}