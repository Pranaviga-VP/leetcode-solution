// Last updated: 2/4/2026, 4:36:58 PM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=-1;
            for(int j=1;j<n;j++){
                if( nums[i] < nums[(i+j)%n] ){
                    arr[i]=nums[(i+j)%n];
                    break;
                }
            }
        }
        return arr;
    }
}