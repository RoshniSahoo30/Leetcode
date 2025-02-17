class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        gen(res,curr,nums);
        return res;
    }
    public void gen(List<List<Integer>> res, List<Integer> curr, int[] nums)
    {
        if(curr.size()==nums.length)
        res.add(new ArrayList<>(curr));
        for(int i=0;i<nums.length;i++)
        {
            if(curr.contains(nums[i]))
            continue;
            curr.add(nums[i]);
            gen(res,curr,nums);
            curr.remove(curr.size()-1);
        }
    }
}