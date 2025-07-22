class Solution {
    public int maximumUniqueSubarray(int[] nums) {

        Set<Integer> set=new HashSet<>();
        int ans=0,l=0,curr=0;
        for(int r=0;r<nums.length;r++)
        {
            while(set.contains(nums[r]))
            {
                set.remove(nums[l]);
                curr-=nums[l];
                l++;
            }
            curr+=nums[r];
            set.add(nums[r]);

            ans=Math.max(ans,curr);
        }
        return ans;
        
    }
}