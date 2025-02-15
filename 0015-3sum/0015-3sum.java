class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int target=0;
        Arrays.sort(nums);
        Set<List<Integer>> curr=new HashSet<>();
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while(j<k)
            {
                int s=nums[i]+nums[j]+nums[k];
                if(s==target)
                {
                    curr.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }
                else if(s<target)
                j++;
                else
                k--;
            }
        }
        ans.addAll(curr);
        return ans;
    }
}