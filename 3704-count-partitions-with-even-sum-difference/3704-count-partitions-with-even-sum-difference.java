class Solution {
    public int countPartitions(int[] nums) {
        int n = nums.length;
        int Sum = 0;
        for (int num : nums) {
            Sum += num;
        }

        int l = 0;
        int count = 0;

        for (int i = 0; i < n - 1; i++) {
            l += nums[i];
            int r = Sum - l;
            if (Math.abs(l - r) % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}
