class Solution {
    public int pivotIndex(int[] nums) {

        int s=0,curr=0;
        for(int i:nums)
        s+=i;
        for(int i=0;i<nums.length;i++)
        {
            s-=nums[i];
            if(curr==s)
            return i;
            curr+=nums[i]; 
        }
        return -1;
    }
}