class Solution {
    public int hIndex(int[] nums) {

        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>=nums.length-i)
            return nums.length-i;
        }
        
        return 0;
    }
}