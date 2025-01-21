class Solution {
    public int subarraySum(int[] nums) {

        int s=0,sum=0;
        for(int i=0;i<nums.length;i++)
        {s=Math.max(0,i-nums[i]);
        while(s<=i)
        {sum+=nums[s];
        s++;}
        }
        return sum;
    }
}