class Solution {
    public int minStartValue(int[] nums) {
        int min=0;
        int s=0;

        for(int i:nums)
        {
            s+=i;
            min=Math.min(min,s);
        }
        return 1-min;
    }
}