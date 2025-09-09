class Solution {
    public int findDuplicate(int[] nums) {

        Arrays.sort(nums);
        int c=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
            continue;
            else{
            c= nums[i];
            break;
            }
        }
        return c;
        
    }
}