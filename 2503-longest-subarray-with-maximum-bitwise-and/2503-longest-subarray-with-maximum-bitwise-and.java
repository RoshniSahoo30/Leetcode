class Solution {
    public int longestSubarray(int[] nums) {
        
        int max=0,curr=0,ans=0;
        
        for (int num : nums) {
            if (max < num) {
                max = num;
                ans = curr = 0;
            }

            if (max == num) {
                curr++;
            } else {
                curr = 0;
            }

            ans = Math.max(ans, curr);
        }
        return ans;
    }
}