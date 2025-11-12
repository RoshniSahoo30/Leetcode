class Solution {
    public int minMoves(int[] nums) {

        Arrays.sort(nums);
        int n=nums[nums.length-1];
        int op=0;
        for(int i:nums)
        {
            op=op+(n-i);
        }

        return op;
        
    }
}