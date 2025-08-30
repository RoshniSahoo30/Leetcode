class Solution {
    public int longestSubarray(int[] nums) {

        int l = 0, c = 0, max = 0;
        boolean f = true;
        
        for (int r = 0; r < nums.length; r++) {
            if (nums[r] == 0) {
                c++;
                f = false;
            }
            while (c > 1) {
                if (nums[l] == 0)
                    c--;
                l++;
            }
            max = Math.max(max, (r - l));
        }

        if (f)
            return nums.length - 1;
        
        return max;
    }
}