class Solution {
    public int threeSumClosest(int[] nums, int target) {

        int sum=Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            for(int j=i+1;j<nums.length-1;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    int curr=nums[i]+nums[j]+nums[k];
                    if(Math.abs(curr-target)<Math.abs(sum-target))
                    sum=curr;
                }
            }
        }
        return sum;
        
    }
}