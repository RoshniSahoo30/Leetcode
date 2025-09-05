class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0];
        int curr = nums[0],r=1; 
        while(r<nums.length) {
            curr = Math.max(nums[r], curr + nums[r]);
            max = Math.max(max, curr);
            r++;
        }
        
        return max; 
    }
}
