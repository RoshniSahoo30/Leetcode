class Solution {
    public List<Integer> zigzagTraversal(int[][] grid) {
        int c=0;
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<grid.length;i++)
            {
                if(i%2==0)
                {    
                for(int j=0;j<grid[0].length;j++)
                    {if(c==0)
                    { res.add(grid[i][j]);
                     c=1;}
                     else if(c==1)
                     {c=0;
                     continue;}
                    }
                }
                else
                {
                     for(int j=grid[0].length-1;j>=0;j--)
                    {if(c==0)
                    { res.add(grid[i][j]);
                     c=1;}
                     else if(c==1)
                     {c=0;
                     continue;}
                    }
                }
            }
        return res;        
    }
}