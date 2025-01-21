import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); 
        int prefixSum = 0, result = 0;

        for (int num : nums) {
            prefixSum += num;
        if (prefixSumCount.containsKey(prefixSum - goal)) {
                result += prefixSumCount.get(prefixSum - goal);
            }
            prefixSumCount.put(prefixSum, prefixSumCount.getOrDefault(prefixSum, 0) + 1);
        }

        return result;
    }
}
