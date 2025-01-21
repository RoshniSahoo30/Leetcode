class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int l = 0, c = 0, odd = 0, ans = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                odd++;
            }
            while (odd > k) {
                if (nums[l] % 2 != 0) {
                    odd--;
                }
                l++;
            }
            if (odd == k) {
                c = l;
                while (nums[c] % 2 == 0) {
                    c++;
                }
                ans += (c - l + 1);
            }
        }
        return ans;
    }
}
