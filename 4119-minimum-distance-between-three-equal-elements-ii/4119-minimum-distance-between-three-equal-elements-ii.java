class Solution {
    public int minimumDistance(int[] nums) {

        int n = nums.length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int minDistance = Integer.MAX_VALUE;
        boolean found = false;
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            List<Integer> indices = entry.getValue();
            if (indices.size() >= 3) {
                for (int j = 0; j + 2 < indices.size(); j++) {
                    int first = indices.get(j);
                    int third = indices.get(j + 2);
                    int distance = 2 * (third - first);
                    minDistance = Math.min(minDistance, distance);
                    found = true;
                }
            }
        }

        return found ? minDistance : -1;
        
    }
}