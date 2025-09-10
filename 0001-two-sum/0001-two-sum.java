class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> set=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int nm=target-nums[i];
            if(set.containsKey(nm))
            return new int[]{set.get(nm),i};
            set.put(nums[i],i);
        }
        return null;
        
    }
}