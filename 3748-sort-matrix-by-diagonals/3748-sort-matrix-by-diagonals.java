class Solution {
    public int[][] sortMatrix(int[][] grid) {
        Map<Integer,List<Integer>> mp=new HashMap<>();
        int r=grid.length,c=grid[0].length;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int val=i-j;
                mp.putIfAbsent(val,new ArrayList<>());
                mp.get(val).add(grid[i][j]);
            }
        }
        for(Map.Entry<Integer,List<Integer>> i:mp.entrySet())
        {
            List<Integer> val=i.getValue();
            if(i.getKey()<0)
            Collections.sort(val);
            else
            val.sort(Collections.reverseOrder());
        }
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int val=i-j;
                grid[i][j]=mp.get(val).remove(0);
            }
        }
        return grid;
    }
}