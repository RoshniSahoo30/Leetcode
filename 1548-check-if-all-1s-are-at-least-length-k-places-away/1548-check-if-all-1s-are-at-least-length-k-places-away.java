class Solution {
    public boolean kLengthApart(int[] nums, int k) {

        int gap=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                if(gap!=-1 && i-gap-1<k)
                return false;
                gap=i;
            }

        }
        return true;
        
    }
}