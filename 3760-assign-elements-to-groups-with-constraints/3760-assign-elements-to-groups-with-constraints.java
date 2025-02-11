class Solution {
    public int[] assignElements(int[] groups, int[] elements) {
        int n = groups.length;
        int m = elements.length;
       Map<Integer,Integer> mp=new HashMap<>();
       for(int i=0;i<m;i++)
       mp.putIfAbsent(elements[i],i);
       int res[]=new int[n];
       for(int j=0;j<n;j++)
       res[j]=find(groups[j],mp);
       return res;
    }
    public static int find(int val,Map<Integer,Integer> mp)
    {
        int min=Integer.MAX_VALUE;
        for(int i=1;i*i<=val;i++)
        {
            if(val%i==0)
            {
                if(mp.containsKey(i))
                min=Math.min(min,mp.get(i));
                if(i!=val/i && mp.containsKey(val/i))
                min=Math.min(min,mp.get(val/i));
            }
        }
            return (min==Integer.MAX_VALUE)?-1:min;
    }
}