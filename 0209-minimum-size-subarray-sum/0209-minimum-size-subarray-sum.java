class Solution {
    public int minSubArrayLen(int target, int[] nums) {
    
     int curr=0,l=0,r=0;
     int len=Integer.MAX_VALUE;
     for(r=0;r<nums.length;r++)
     {
        curr+=nums[r];
        while(curr>=target)
        {
            len=Math.min(len,r-l+1);
            curr-=nums[l++];
        }
     }
     return len==Integer.MAX_VALUE?0:len;
    }
}