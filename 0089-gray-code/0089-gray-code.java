class Solution {
    public List<Integer> grayCode(int n) {

        List<Integer> res=new ArrayList<>();
        res.add(0);
        Set<Integer> curr=new HashSet<>();
        curr.add(0);
        backtrack(res,curr,n);
        return res;
    }
    private void backtrack(List<Integer> res, Set<Integer> curr, int n)
    {
        if(res.size()==(1<<n))
        return;
        int l=0,r=0;
        for(int i=0;i<n;i++)
        {
            l=res.get(res.size()-1);
            r=l^(1<<i);
            if(!curr.contains(r))
            {
                curr.add(r);
                res.add(r);
                backtrack(res,curr,n);
            }
        }
    }
}