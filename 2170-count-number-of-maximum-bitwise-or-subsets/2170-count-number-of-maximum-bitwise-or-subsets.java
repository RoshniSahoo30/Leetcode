class Solution {
    public int countMaxOrSubsets(int[] nums) {
        
        int max=0;
        for(int i:nums)
        max|=i;

        return backtrack(nums,0,0,max);
    }
    int backtrack(int[] nums, int idx, int curr, int max)
    {
        if(idx==nums.length)
        return curr == max ?1:0;

        if(curr==max)
        return 1<<(nums.length - idx);

        return backtrack(nums, idx + 1, curr | nums[idx], max) +
               backtrack(nums, idx + 1, curr, max);
    
    }
}