class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> res=new ArrayList<>();
        List<Integer> curr=new ArrayList<>();
        backtrack(res,curr,n,k,1);
        return res;
    }
    void backtrack(List<List<Integer>> res, List<Integer> curr, int n, int k, int idx)
    {
        if(curr.size()==k)
        {
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=idx;i<=n;i++)
        {
            curr.add(i);
            backtrack(res,curr,n,k,i+1);
            curr.remove(curr.size()-1);
        }
    }
}