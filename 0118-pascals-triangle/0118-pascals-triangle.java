class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res =new ArrayList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> curr=new ArrayList<>();
            curr.add(1);
            if(i>0)
            {
                List<Integer> prev=res.get(i-1);
                for(int j=1;j<i;j++)
                {
                    int n=prev.get(j-1)+prev.get(j);
                    curr.add(n);
                }
            }
            if(i>0)
            curr.add(1);
            res.add(curr);
        }
        
        return res;
    }
}