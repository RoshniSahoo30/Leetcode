class Solution {
    public int maxAscendingSum(int[] nums) {

        int l=0,r=0;
        int max=0,curr=nums[0];
        for(int i=1;i<nums.length;i++)
        {
         if(nums[i]<=nums[i-1])   
         {max=Math.max(max,curr);
         curr=0;}
         curr+=nums[i];
        }
        return Math.max(max,curr);
    }
}