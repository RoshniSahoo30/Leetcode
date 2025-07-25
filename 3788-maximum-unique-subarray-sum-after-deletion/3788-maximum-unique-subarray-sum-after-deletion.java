import java.util.*;

class Solution {
    public int maxSum(int[] nums) {
        Arrays.sort(nums); 
        Set<Integer> set = new HashSet<>();
        int s = 0;

        for (int i : nums) {
            set.add(i); }

        for (int i : set) {
            if (i > 0) {
                s += i;
            }
        }
    return s == 0 ? nums[nums.length - 1] : s;
    }
}
